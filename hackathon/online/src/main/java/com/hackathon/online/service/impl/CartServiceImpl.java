package com.hackathon.online.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.online.domain.Cart;
import com.hackathon.online.model.CurrentUser;
import com.hackathon.online.model.dto.CartDTO;
import com.hackathon.online.repository.CartReposioty;
import com.hackathon.online.service.CartService;
import com.hackathon.online.utils.ObjectBinder;
@Service
public class CartServiceImpl implements CartService {
private static final Logger logger=LoggerFactory.getLogger(CartServiceImpl.class);
@Autowired
private CartReposioty cartReposioty;
@Autowired
private ObjectBinder objectBinder;
	@Override
	public Cart saveOrUpdate(Cart cart, CurrentUser currentUser) {
		if(cart.getId() == null) {
			return this.cartReposioty.save(cart);
			
		}else if(cart.getId() !=null){
			Cart getCart=this.cartReposioty.findbyProductIdAndSupplierId(cart.getProductId(),Long.valueOf(currentUser.getUserId()));
		      if(getCart!=null && cart.getProductQuantity() >0)
		      {
		    	  Double currentPrice=cart.getTotalPrice();
		    	  cart.setTotalPrice(currentPrice*cart.getProductQuantity());
		    	 return this.cartReposioty.save(cart);
		      }
		}
		return null;
	}

	@Override
	public Cart getById(Long cartId, CurrentUser currentUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CartDTO> list(CurrentUser currentUser) {
		return   this.objectBinder.bindCarts(this.cartReposioty.findByUserId(Long.valueOf(currentUser.getUserId())));
	}

}
