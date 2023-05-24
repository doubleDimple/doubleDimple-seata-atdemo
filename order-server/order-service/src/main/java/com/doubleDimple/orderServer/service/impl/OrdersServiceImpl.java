package com.doubleDimple.orderServer.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.doubleDimple.orderServer.mapper.OrdersMapper;
import com.doubleDimple.orderServer.service.OrdersService;
import common.entity.enums.PageSize;
import common.entity.page.PaginationResult;
import common.entity.page.SimplePage;
import common.entity.pojo.Orders;
import common.entity.query.OrdersQuery;
import org.springframework.stereotype.Service;



/**
 * 
 *  业务接口实现
 * 
 */
@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {

	@Resource
	private OrdersMapper<Orders, OrdersQuery> ordersMapper;

	/**
	 * 根据条件查询列表
	 */
	public List<Orders> findListByParam(OrdersQuery param) {
		List<Orders> list = this.ordersMapper.selectList(param);
		return list;
	}

	/**
	 * 根据条件查询列表
	 */
	public Integer findCountByParam(OrdersQuery param) {
		Integer count = this.ordersMapper.selectCount(param);
		return count;
	}

	/**
	 * 分页查询方法
	 */
	public PaginationResult<Orders> findListByPage(OrdersQuery param) {
		int count = this.ordersMapper.selectCount(param);
		int pageSize = param.getPageSize()==null? PageSize.SIZE15.getSize():param.getPageSize();
		int pageNo = 0;
		if (null != param.getPageNo()) {
			pageNo=param.getPageNo();
		}
		SimplePage page = new SimplePage(pageNo, count, pageSize);
		param.setPage(page);
		List<Orders> list = this.ordersMapper.selectList(param);
		PaginationResult<Orders> result = new PaginationResult<Orders>(page, list);
		return result;
	}

	/**
	 * 新增
	 */
	public Integer add(Orders bean){
		return this.ordersMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<Orders> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.ordersMapper.insertBatch(listBean);
	}

	/**
	 * 修改
	 */
	public Integer updateByPrimaryKey(Orders bean,Integer id){
		return this.ordersMapper.updateByPrimaryKey(bean,id);
	}

	/**
	 * 删除
	 */
	public Integer deleteByPrimaryKey(Integer id){
		return this.ordersMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 根据primaryKey获取对象
	 */
	public Orders getOrdersByPrimaryKey(Integer id){
		return this.ordersMapper.selectByPrimaryKey(id);
	}

}