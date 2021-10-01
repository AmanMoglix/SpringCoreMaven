package com.moglix.employemanagement.dao;

import java.util.List;

import com.moglix.employemanagement.domain.Cart;



public interface CartDao {
	public String saveOrUpdate(Cart cart);

	public Cart getById(Long cartId);

	public List<Cart> getList();

	public String deleteById(Long cartId);
}
