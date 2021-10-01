package com.moglix.employemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moglix.employemanagement.dao.OrderDao;
import com.moglix.employemanagement.dao.impl.OrderDaoImpl;
import com.moglix.employemanagement.domain.Orders;
import com.moglix.employemanagement.service.OrderService;


@Component
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderDao orderDao ;

	@Override
	public String saveOrUpdate(Orders order) {
		return orderDao.saveOrUpdate(order);
	}

	@Override
	public Orders getById(Long orderId) {
		return orderDao.getById(orderId);
	}

	@Override
	public List<Orders> getList() {
		return orderDao.getList();
	}

	@Override
	public String deleteById(Long orderId) {
		return orderDao.deleteById(orderId);
	}

}
