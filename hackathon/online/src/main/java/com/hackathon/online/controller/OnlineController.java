package com.hackathon.online.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.online.domain.Cart;
import com.hackathon.online.model.CurrentUser;
import com.hackathon.online.model.dto.CartDTO;
import com.hackathon.online.model.dto.discovery.OnlineProductListingDTO;
import com.hackathon.online.service.CartService;
import com.hackathon.online.service.DiscoveryService;

@RestController
@RequestMapping(value = "/online")
public class OnlineController {
	private static final Logger logger = LoggerFactory.getLogger(OnlineController.class);
	@Autowired
	private DiscoveryService discoveryService;
	@Autowired
	private CartService cartService;

	@RequestMapping(value = "", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public Cart saveOrUpdate(@RequestBody Cart cart, @RequestHeader("X_AUTHORITY") String authority,
			@RequestHeader("X_USER_ID") String userId, @RequestHeader("X_USERNAME") String username,
			@RequestHeader("X_LOCATION") String location) {
		CurrentUser currentUser = CurrentUser.getInstance(userId, username, authority, location);

		return this.cartService.saveOrUpdate(cart, currentUser);
	}

	@RequestMapping(value = "", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public List<CartDTO> cartItems(@RequestHeader("X_AUTHORITY") String authority,
			@RequestHeader("X_USER_ID") String userId, @RequestHeader("X_USERNAME") String username,
			@RequestHeader("X_LOCATION") String location) {
		CurrentUser currentUser = CurrentUser.getInstance(userId, username, authority, location);
		List<CartDTO> carts = this.cartService.list(currentUser);
		carts.forEach(it -> {
			if (it != null)
				it.setCatalog(this.discoveryService.fetchProductByProductId(it.getProductId(), currentUser));
		});
		return carts;
	}

	@RequestMapping(value = "/product", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public List<OnlineProductListingDTO> list(@RequestHeader("X_AUTHORITY") String authority,
			@RequestHeader("X_USER_ID") String userId, @RequestHeader("X_USERNAME") String username,
			@RequestHeader("X_LOCATION") String location) {

		CurrentUser currentUser = CurrentUser.getInstance(userId, username, authority, location);
		List<OnlineProductListingDTO> onlineProductListingDTOs = this.discoveryService.fetchProductForList(currentUser);
		onlineProductListingDTOs.forEach(it -> {
			if (it != null)
				it.setCatalog(this.discoveryService.fetchProductByProductId(it.getProductId(), currentUser));
		});
		return onlineProductListingDTOs;
	}
}
