package com.moglix.employemanagement.service;

import java.util.List;

import com.moglix.employemanagement.domain.Inventory;



public interface InventoryService {
	public String saveOrUpdate(Inventory inventory);

	public Inventory getById(Long inventoryId);

	public List<Inventory> getList();

	public String deleteById(Long inventoryId);
}
