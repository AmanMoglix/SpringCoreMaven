package com.moglix.employemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.moglix.employemanagement.domain.Orders;
import com.moglix.employemanagement.service.OrderService;
import com.moglix.employemanagement.service.impl.OrderServiceImpl;


public class OrderController {
	@Autowired
	OrderService orderService ;

	public String saveOrUpdate(Orders order) {
		return this.orderService.saveOrUpdate(order);
	}

	public Orders getById(Long orderId) {
		return this.orderService.getById(orderId);
	}

	public List<Orders> list() {
		return this.orderService.getList();
	}

	public String delete(Long orderId) {
		return this.orderService.deleteById(orderId);
	}
}
