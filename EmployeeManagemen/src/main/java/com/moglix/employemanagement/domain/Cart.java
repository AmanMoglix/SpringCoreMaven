package com.moglix.employemanagement.domain;

import lombok.Data;

@Data
public class Cart {
private Long cartId;
private Long userId;
private Long inventoryId;
private Long productId;
private Integer productQuantity;
private Double totalPrice;
}
