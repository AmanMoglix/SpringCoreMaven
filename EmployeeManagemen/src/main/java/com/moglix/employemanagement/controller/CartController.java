package com.moglix.employemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.moglix.employemanagement.domain.Cart;
import com.moglix.employemanagement.service.CartService;



public class CartController {
	@Autowired
	CartService cartSevice ;

	public String saveOrUpdate(Cart cart) {
		return this.cartSevice.saveOrUpdate(cart);
	}

	public Cart getById(Long cartId) {
		return this.cartSevice.getById(cartId);
	}

	public List<Cart> list() {
		return this.cartSevice.getList();
	}

	public String delete(Long cartId) {
		return this.cartSevice.deleteById(cartId);
	}
}
