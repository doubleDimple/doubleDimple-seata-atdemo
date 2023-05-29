package com.doubleDimple.userServer.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import com.doubleDimple.userServer.config.JwtUtils;
import com.doubleDimple.userServer.mapper.UsersMapper;
import com.doubleDimple.userServer.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import users.entity.enums.PageSize;
import users.entity.page.PaginationResult;
import users.entity.page.SimplePage;
import users.entity.pojo.Users;
import users.entity.query.UsersQuery;
import users.request.UserRequest;
import users.response.enums.ResponseEnum;
import users.utils.PasswordUtil;
import users.utils.Result;
import users.utils.UserContext;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("usersService")
@Slf4j
public class UsersServiceImpl implements UsersService {

	@Resource
	private UsersMapper<Users, UsersQuery> usersMapper;

	@Resource
	private JwtUtils jwtUtils;

	/**
	 * 根据条件查询列表
	 */
	public List<Users> findListByParam(UsersQuery param) {
		List<Users> list = this.usersMapper.selectList(param);
		return list;
	}

	/**
	 * 根据条件查询列表
	 */
	public Integer findCountByParam(UsersQuery param) {
		Integer count = this.usersMapper.selectCount(param);
		return count;
	}

	/**
	 * 分页查询方法
	 */
	public PaginationResult<Users> findListByPage(UsersQuery param) {
		int count = this.usersMapper.selectCount(param);
		int pageSize = param.getPageSize()==null? PageSize.SIZE15.getSize():param.getPageSize();
		int pageNo = 0;
		if (null != param.getPageNo()) {
			pageNo=param.getPageNo();
		}
		SimplePage page = new SimplePage(pageNo, count, pageSize);
		param.setPage(page);
		List<Users> list = this.usersMapper.selectList(param);
		PaginationResult<Users> result = new PaginationResult<Users>(page, list);
		return result;
	}

	/**
	 * 新增
	 */
	public Integer add(Users bean){
		return this.usersMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<Users> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.usersMapper.insertBatch(listBean);
	}

	/**
	 * 修改
	 */
	public Integer updateByPrimaryKey(Users bean,Integer userId){
		return this.usersMapper.updateByPrimaryKey(bean,userId);
	}

	/**
	 * 删除
	 */
	public Integer deleteByPrimaryKey(Integer userId){
		return this.usersMapper.deleteByPrimaryKey(userId);
	}

	/**
	 * 根据primaryKey获取对象
	 */
	public Users getUsersByPrimaryKey(Integer userId){
		return this.usersMapper.selectByPrimaryKey(userId);
	}

	@Override
	public void insertUser(Users users) {
		//对密码进行加密
		final String rawPassword = users.getPasswordHash();
		String hashPass = PasswordUtil.encryptPassword(rawPassword, PasswordUtil.generateSalt());
		users.setPasswordHash(hashPass);

		this.usersMapper.insert(users);


	}

	@Override
	public Result checkLogin(UserRequest users, HttpSession session) {
		final String phoneNumber = users.getPhoneNumber();
		final String passwordRequest = users.getPassword();
		// 查询手机号是否存在
		UsersQuery query = new UsersQuery();
		query.setPhoneNumber(phoneNumber);
		Users usersDetail;
		final List<Users> usersDb = this.usersMapper.selectList(query);
		if (CollectionUtils.isEmpty(usersDb)){
			throw new RuntimeException("用户不存在");
		}else {
			usersDetail = usersDb.get(0);
			String passwordHashDb = usersDetail.getPasswordHash();
			if (!PasswordUtil.verifyPassword(passwordRequest, passwordHashDb)){
				log.info("用户密码错误");
				return Result.exception(ResponseEnum.FAIL.getCode(), "用户密码错误");
			}
		}

		// 生成JWT令牌
		String token = jwtUtils.generateToken(usersDetail.getUserId(), usersDetail.getUsername(), usersDetail.getPhoneNumber());

		// 将令牌存储到Session中
		session.setAttribute("token", token);

		UserContext.setUser(usersDetail);

		// 返回响应
		return Result.ok(token);

	}

}