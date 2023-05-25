package com.doubleDimple.orderServer.service;

import common.entity.page.PaginationResult;
import common.entity.pojo.Orders;
import common.entity.query.OrdersQuery;

import java.util.List;


/**
 * 
 *  业务接口
 * 
 */
public interface OrdersService {

	/**
	 * 根据条件查询列表
	 */
	public List<Orders> findListByParam(OrdersQuery param);

	/**
	 * 根据条件查询列表
	 */
	public Integer findCountByParam(OrdersQuery param);

	/**
	 * 分页查询
	 */
	public PaginationResult<Orders> findListByPage(OrdersQuery param);

	/**
	 * 新增
	 */
	public Integer add(Orders bean);

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<Orders> listBean);

	/**
	 * 根据主键修改
	 */
	public Integer updateByPrimaryKey(Orders bean  ,Integer id);


	/**
	 * 根据主键删除
	 */
	public Integer deleteByPrimaryKey(Integer id);


	/**
	 * 根据primaryKey获取对象
	 */
	 public Orders getOrdersByPrimaryKey(Integer id);

	void insertAndDeduction(Orders orders);
}