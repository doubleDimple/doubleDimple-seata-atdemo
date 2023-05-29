package com.doubleDimple.userServer.service;

import com.doubleDimple.users.entity.page.PaginationResult;
import com.doubleDimple.users.entity.pojo.Users;
import com.doubleDimple.users.entity.query.UsersQuery;
import com.doubleDimple.users.request.UserRequest;
import com.doubleDimple.users.utils.Result;

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