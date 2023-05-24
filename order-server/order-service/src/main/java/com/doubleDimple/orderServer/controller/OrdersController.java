package com.doubleDimple.orderServer.controller;

import javax.annotation.Resource;

import com.doubleDimple.orderServer.service.OrdersService;
import common.entity.page.PaginationResult;
import common.entity.pojo.Orders;
import common.entity.query.OrdersQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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

	/**
	 * 分页查询方法
	 */
	@RequestMapping("/list")
	public PaginationResult<Orders> list(@RequestBody @Validated OrdersQuery queryParam) {

		PaginationResult<Orders> result = this.ordersService.findListByPage(queryParam);
		return result;
	}


	/**
	 * 分页查询方法
	 */
	@RequestMapping("/insert")
	public ResponseEntity list(@RequestBody Orders orders) {

		ordersService.add(orders);
		return ResponseEntity.ok().build();
	}
}