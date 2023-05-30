package com.doubleDimple.userServer.interceptor;

import com.doubleDimple.userServer.annotation.PassToken;
import com.doubleDimple.userServer.config.JwtUtils;
import com.doubleDimple.userServer.mapper.UsersMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import com.doubleDimple.users.entity.pojo.Users;
import com.doubleDimple.users.entity.query.UsersQuery;
import com.doubleDimple.users.exception.MyException;
import com.doubleDimple.users.response.enums.ResponseEnum;
import com.doubleDimple.users.utils.UserContext;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;

@Component
public class MyJwtInterceptor implements HandlerInterceptor {

    @Resource
    private UsersMapper<Users, UsersQuery> usersMapper;

    @Resource
    private JwtUtils jwtUtils;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        //检查是否通过有PassToken注解
        if (method.isAnnotationPresent(PassToken.class)) {
            //如果有则跳过认证检查
            PassToken passToken = method.getAnnotation(PassToken.class);
            if (passToken.required()) {
                return true;
            }
        }


        String token = getToken(request);

        //否则进行token检查
        if (StringUtils.isBlank(token)) {
            throw new MyException(ResponseEnum.FAIL.getCode(), "token不存在");
        }

        //验证token
        if (!jwtUtils.validateToken(token)){
            throw new MyException(ResponseEnum.FAIL.getCode(), "权限验证失败！");
        }

        //获取token中的用户id
        Integer userId = jwtUtils.getIdFromToken(token);

        //根据token中的userId查询数据库
        Users user = usersMapper.selectByPrimaryKey(userId);
        if (user == null) {
            throw new MyException(ResponseEnum.FAIL.getCode(), "用户不存在");
        }

        //token续期
        /*String renewToken = jwtUtils.renewToken(token);
        HttpSession session = request.getSession();
        session.setAttribute("token", renewToken);*/

        UserContext.setUser(user);
        return true;
    }


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

         HttpSession session = request.getSession();
         String token = (String)session.getAttribute("token");

         //获取token中的用户id
         Integer userId = jwtUtils.getIdFromToken(token);

         //根据token中的userId查询数据库
         Users user = usersMapper.selectByPrimaryKey(userId);

    }


    private String getToken(HttpServletRequest request) {
        String token = StringUtils.EMPTY;
        // 获取Authorization标头的值
        String authorizationHeader = request.getHeader("Authorization");
        // 检查Authorization标头是否存在且以Bearer开头
        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            // 提取令牌
            token = authorizationHeader.substring(7); // 去除"Bearer "前缀
        }
        return token;
    }
}
