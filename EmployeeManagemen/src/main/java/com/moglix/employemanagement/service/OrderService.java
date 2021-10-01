package com.moglix.employemanagement.service;

import java.util.List;

import com.moglix.employemanagement.domain.Orders;



public interface OrderService {
	public String saveOrUpdate(Orders order);

	public Orders getById(Long orderId);

	public List<Orders> getList();

	public String deleteById(Long orderId);
}
