package com.doubleDimple.stockServer.controller;

import javax.annotation.Resource;

import com.doubleDimple.stockServer.service.InventoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import stock.entity.page.PaginationResult;
import stock.entity.pojo.Inventory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import stock.entity.query.InventoryQuery;



/**
 * 
 *  控制层
 * 
 */
@Controller
@RequestMapping("/inventory")
public class InventoryController{

	@Resource
	private InventoryService inventoryService;

	/**
	 * 分页查询方法
	 */
	@RequestMapping("/list")
	public ResponseEntity list(@RequestBody InventoryQuery queryParam) {
		PaginationResult<Inventory> result = this.inventoryService.findListByPage(queryParam);
		return ResponseEntity.ok(result);
	}


	/**
	 * 添加商品
	 */
	@RequestMapping("/add")
	public  ResponseEntity add(@RequestBody Inventory inventory){
		final Integer add = this.inventoryService.add(inventory);
		return ResponseEntity.ok().build();
	}

	/**
	 * 修改库存
	 */
	@RequestMapping("/update")
	public ResponseEntity update(@RequestBody Inventory inventory){
		this.inventoryService.updateAtTest(inventory,inventory.getId());
		return ResponseEntity.ok().build();
	}
}