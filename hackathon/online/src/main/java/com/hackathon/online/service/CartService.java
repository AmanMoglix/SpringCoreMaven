package com.hackathon.online.service;

import java.util.List;

import com.hackathon.online.domain.Cart;
import com.hackathon.online.model.CurrentUser;
import com.hackathon.online.model.dto.CartDTO;

public interface CartService {
public Cart saveOrUpdate(Cart cart,CurrentUser currentUser);
public Cart getById(Long cartId,CurrentUser currentUser);
public List<CartDTO> list(CurrentUser currentUser);

}
