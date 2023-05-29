package com.doubleDimple.userServer.service;

import org.springframework.http.ResponseEntity;
import users.entity.page.PaginationResult;
import users.entity.pojo.Users;
import users.entity.query.UsersQuery;
import users.request.UserRequest;
import users.utils.Result;

import javax.servlet.http.HttpSession;
import java.util.List;



/**
 * 
 *  业务接口
 * 
 */
public interface UsersService {

	/**
	 * 根据条件查询列表
	 */
	public List<Users> findListByParam(UsersQuery param);

	/**
	 * 根据条件查询列表
	 */
	public Integer findCountByParam(UsersQuery param);

	/**
	 * 分页查询
	 */
	public PaginationResult<Users> findListByPage(UsersQuery param);

	/**
	 * 新增
	 */
	public Integer add(Users bean);

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<Users> listBean);

	/**
	 * 根据主键修改
	 */
	public Integer updateByPrimaryKey(Users bean  ,Integer userId);


	/**
	 * 根据主键删除
	 */
	public Integer deleteByPrimaryKey(Integer userId);


	/**
	 * 根据primaryKey获取对象
	 */
	 public Users getUsersByPrimaryKey(Integer userId);

	void insertUser(Users users);

	Result checkLogin(UserRequest users, HttpSession session);
}