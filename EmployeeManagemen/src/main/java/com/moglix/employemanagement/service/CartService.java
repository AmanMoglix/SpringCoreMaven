package com.moglix.employemanagement.service;

import java.util.List;

import com.moglix.employemanagement.domain.Cart;



public interface CartService {
	public String saveOrUpdate(Cart cart);

	public Cart getById(Long cartId);

	public List<Cart> getList();

	public String deleteById(Long cartId);
}
