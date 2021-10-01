package com.moglix.employemanagement.domain;

import lombok.Data;

@Data
public class Inventory {
private Long inventroyId;
private Long userId;
//oneToMany
private Long productId;
private Integer productQuantity;
private Double productPrice;

}
