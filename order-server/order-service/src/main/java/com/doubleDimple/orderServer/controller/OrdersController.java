package com.doubleDimple.orderServer.controller;

import javax.annotation.Resource;

import com.doubleDimple.orderServer.service.OrdersService;
import com.doubleDimple.orderServer.testConfig.MyService;
import common.entity.page.PaginationResult;
import common.entity.pojo.Orders;
import common.entity.query.OrdersQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 *  控制层
 * 
 */
@RestController
@RequestMapping("/orders")
public class OrdersController{

	@Resource
	private OrdersService ordersService;


	@Resource
	private MyService myService;

	/**
	 * 分页查询方法
	 */
	@RequestMapping("/list")
	public PaginationResult<Orders> list(@RequestBody @Validated OrdersQuery queryParam) {

		PaginationResult<Orders> result = this.ordersService.findListByPage(queryParam);
		return result;
	}


	/**
	 * 新增
	 */
	@RequestMapping("/insert")
	public ResponseEntity list(@RequestBody Orders orders) {

		ordersService.add(orders);
		return ResponseEntity.ok().build();
	}


	/**
	 * 下单减库存
	 */
	@RequestMapping("/insertAndDeduction")
	public ResponseEntity insertAndDeduction(@RequestBody Orders orders) {

		try {
			ordersService.insertAndDeduction(orders);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return ResponseEntity.ok().build();
	}


	@RequestMapping("/getMessage")
	public ResponseEntity getmessage() {

		myService.doSomething();
		return ResponseEntity.ok().build();
	}

}