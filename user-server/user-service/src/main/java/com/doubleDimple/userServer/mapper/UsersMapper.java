package com.doubleDimple.userServer.mapper;

import com.doubleDimple.users.entity.pojo.Users;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *  数据库操作接口
 * 
 */
public interface UsersMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据primaryKey更新
	 */
	 public Integer updateByPrimaryKey(@Param("bean") T t,@Param("userId") Integer userId);


	/**
	 * 根据primaryKey删除
	 */
	 public Integer deleteByPrimaryKey(@Param("userId") Integer userId);


	/**
	 * 根据primaryKey获取对象
	 */
	 public T selectByPrimaryKey(@Param("userId") Integer userId);


    Users findByUsername(@Param("username")String username);
}
