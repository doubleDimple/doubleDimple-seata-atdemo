package com.doubleDimple.stockServer.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.doubleDimple.stockServer.mapper.InventoryMapper;
import com.doubleDimple.stockServer.service.InventoryService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import stock.entity.enums.PageSize;
import stock.entity.page.PaginationResult;
import stock.entity.page.SimplePage;
import stock.entity.pojo.Inventory;
import stock.entity.query.InventoryQuery;


/**
 * 
 *  业务接口实现
 * 
 */
@Service("inventoryService")
@Slf4j
public class InventoryServiceImpl implements InventoryService {

	@Resource
	private InventoryMapper<Inventory, InventoryQuery> inventoryMapper;

	/**
	 * 根据条件查询列表
	 */
	public List<Inventory> findListByParam(InventoryQuery param) {
		List<Inventory> list = this.inventoryMapper.selectList(param);
		return list;
	}

	/**
	 * 根据条件查询列表
	 */
	public Integer findCountByParam(InventoryQuery param) {
		Integer count = this.inventoryMapper.selectCount(param);
		return count;
	}

	/**
	 * 分页查询方法
	 */
	public PaginationResult<Inventory> findListByPage(InventoryQuery param) {
		int count = this.inventoryMapper.selectCount(param);
		int pageSize = param.getPageSize()==null?PageSize.SIZE15.getSize():param.getPageSize();
		int pageNo = 0;
		if (null != param.getPageNo()) {
			pageNo=param.getPageNo();
		}
		SimplePage page = new SimplePage(pageNo, count, pageSize);
		param.setPage(page);
		List<Inventory> list = this.inventoryMapper.selectList(param);
		PaginationResult<Inventory> result = new PaginationResult<Inventory>(page, list);
		return result;
	}

	/**
	 * 新增
	 */
	public Integer add(Inventory bean){
		return this.inventoryMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<Inventory> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.inventoryMapper.insertBatch(listBean);
	}

	/**
	 * 修改
	 */
	public Integer updateByPrimaryKey(Inventory bean,Integer id){
		return this.inventoryMapper.updateByPrimaryKey(bean,id);
	}

	/**
	 * 删除
	 */
	public Integer deleteByPrimaryKey(Integer id){
		return this.inventoryMapper.deleteByPrimaryKey(id);
	}

	/**
	 * 根据primaryKey获取对象
	 */
	public Inventory getInventoryByPrimaryKey(Integer id){
		return this.inventoryMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateAtTest(Inventory inventory, Integer id) throws Exception{
		String xid = RootContext.getXID();
		log.info("xid:[{}]",xid);
		this.inventoryMapper.updateByPrimaryKey(inventory,id);
	}

}