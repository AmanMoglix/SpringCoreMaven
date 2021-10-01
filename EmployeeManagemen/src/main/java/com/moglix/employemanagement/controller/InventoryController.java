package com.moglix.employemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.moglix.employemanagement.domain.Inventory;
import com.moglix.employemanagement.service.InventoryService;


public class InventoryController {
	@Autowired
	InventoryService inventroryService ;

	public String saveOrUpdate(Inventory inventrory) {
		return this.inventroryService.saveOrUpdate(inventrory);
	}

	public Inventory getById(Long inventoryId) {
		return this.inventroryService.getById(inventoryId);
	}

	public List<Inventory> list() {
		return this.inventroryService.getList();
	}

	public String delete(Long inventoryId) {
		return this.inventroryService.deleteById(inventoryId);
	}
}
