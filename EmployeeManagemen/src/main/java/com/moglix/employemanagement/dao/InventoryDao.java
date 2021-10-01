package com.moglix.employemanagement.dao;

import java.util.List;

import com.moglix.employemanagement.domain.Inventory;



public interface InventoryDao {
	public String saveOrUpdate(Inventory inventory);

	public Inventory getById(Long inventoryId);

	public List<Inventory> getList();

	public String deleteById(Long inventoryId);
}
