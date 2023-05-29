package com.doubleDimple.userServer.controller;

import javax.annotation.Resource;

import com.doubleDimple.userServer.annotation.PassToken;
import com.doubleDimple.userServer.config.ApplicationContextProvider;
import com.doubleDimple.userServer.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import users.entity.page.PaginationResult;
import users.entity.pojo.Users;
import users.entity.query.UsersQuery;
import users.request.UserRequest;
import users.utils.Result;
import users.utils.UserContext;

import javax.servlet.http.HttpSession;



/**
 * 
 *  控制层
 * 
 */
@RestController
@RequestMapping("/users")
@Slf4j
public class UsersController{

	@Resource
	private UsersService usersService;

	/**
	 * 分页查询方法
	 */
	@RequestMapping("/list")
	public Result list(UsersQuery queryParam, HttpSession session, Integer useSession) {
		Users user = UserContext.getUser();
		log.info("userId:[{}]",user);
		log.info("bean:[{}]",user);
		String token = (String) session.getAttribute("token");
		log.info("token:[{}]",token);
		PaginationResult<Users> result = this.usersService.findListByPage(queryParam);
		return Result.ok(result);
	}


	/**
	 * 用户注册
	 */
	@RequestMapping("/regist")
	@PassToken
	public void regist(@RequestBody Users users){
		this.usersService.insertUser(users);
	}


	/**
	 * 用户登录
	 */
	@RequestMapping("/login")
	@PassToken
	public Result login(@RequestBody UserRequest users, HttpSession session){
		return this.usersService.checkLogin(users,session);
	}
}