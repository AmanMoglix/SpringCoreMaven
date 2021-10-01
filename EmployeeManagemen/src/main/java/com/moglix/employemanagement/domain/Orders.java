package com.moglix.employemanagement.domain;

import lombok.Data;

@Data
public class Orders {
private Long orderId;
private Long userId;
private Long inventoryId;
//oneTo many
private Long productId;
private Integer quantity;
private Double totalPrice;
private Double grandTotalPrice;
}
