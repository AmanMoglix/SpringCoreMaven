package com.moglix.employemanagement.dao;

import java.util.List;

import com.moglix.employemanagement.domain.Orders;


public interface OrderDao {
	public String saveOrUpdate(Orders order);

	public Orders getById(Long orderId);

	public List<Orders> getList();

	public String deleteById(Long orderId);
}
