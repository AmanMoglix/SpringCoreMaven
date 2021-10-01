package com.moglix.employemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moglix.employemanagement.dao.CartDao;
import com.moglix.employemanagement.dao.impl.CartDaoImpl;
import com.moglix.employemanagement.domain.Cart;
import com.moglix.employemanagement.service.CartService;

@Component
public class CartServiceImpl implements CartService {
	@Autowired
	CartDao cartDao ;


	@Override
	public String saveOrUpdate(Cart cart) {
		return cartDao.saveOrUpdate(cart);
	}

	@Override
	public Cart getById(Long cartId) {
		return this.cartDao.getById(cartId);
	}

	@Override
	public List<Cart> getList() {
		return this.cartDao.getList();
	}

	@Override
	public String deleteById(Long cartId) {
		return this.cartDao.deleteById(cartId);
	}

}
