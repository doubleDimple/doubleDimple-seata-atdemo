package com.doubleDimple.stockServer.service;

import stock.entity.page.PaginationResult;
import stock.entity.pojo.Inventory;
import stock.entity.query.InventoryQuery;

import java.util.List;



/**
 * 
 *  业务接口
 * 
 */
public interface InventoryService {

	/**
	 * 根据条件查询列表
	 */
	public List<Inventory> findListByParam(InventoryQuery param);

	/**
	 * 根据条件查询列表
	 */
	public Integer findCountByParam(InventoryQuery param);

	/**
	 * 分页查询
	 */
	public PaginationResult<Inventory> findListByPage(InventoryQuery param);

	/**
	 * 新增
	 */
	public Integer add(Inventory bean);

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<Inventory> listBean);

	/**
	 * 根据主键修改
	 */
	public Integer updateByPrimaryKey(Inventory bean  ,Integer id);


	/**
	 * 根据主键删除
	 */
	public Integer deleteByPrimaryKey(Integer id);


	/**
	 * 根据primaryKey获取对象
	 */
	 public Inventory getInventoryByPrimaryKey(Integer id);

	void updateAtTest(Inventory inventory, Integer id);
}