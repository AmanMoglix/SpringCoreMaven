package com.moglix.employemanagement.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.moglix.employemanagement.dao.InventoryDao;
import com.moglix.employemanagement.domain.Inventory;

@Component
public class InventoryDaoImpl implements InventoryDao {


	private List<Inventory> inventories = new ArrayList<Inventory>();

	@Override
	public String saveOrUpdate(Inventory inventory) {
		if (this.getById(inventory.getInventroyId()) != null) {
			for (Inventory it : inventories) {
				if (it != null && it.getInventroyId() == inventory.getInventroyId()) {
					it.setUserId(inventory.getUserId());
					it.setProductId(inventory.getProductId());
					it.setProductPrice(inventory.getProductPrice());
					it.setProductQuantity(inventory.getProductQuantity());
					return "Update successfully with inventoryId " + inventory.getInventroyId() + "";
				}
			}
		} else {
//			if (counter < inventories.length) {
//				inventories[counter] = inventory;
//			}
			this.inventories.add(inventory);
		}
		return "Inserted successfully ";
	}

	@Override
	public Inventory getById(Long inventoryId) {
		for (Inventory inventory : inventories) {
			if (inventory != null && inventory.getInventroyId() == inventoryId) {
				return inventory;
			}
		}
		return null;
	}

	@Override
	public List<Inventory> getList() {
		return inventories;
	}

	@Override
	public String deleteById(Long inventoryId) {
		Inventory inventory = this.getById(inventoryId);
		if (inventory != null) {
			this.inventories.remove(inventory);
			return "Entity Deleted Successfully by inventoryId :" + inventoryId + "";
		} else
			return "Internal Server error OR catalogId may not exist";

//		this.counter = 0;
//		for (Inventory inventory : inventories) {
//			if (inventory != null && inventory.getInventroyId() == inventoryId) {
//				inventories[counter] = null;
//				return "Deleted Successfully by inventoryId :" + inventoryId + "";
//			} else {
//				counter++;
//			}
//		}
//		return "Internal Server error OR catalogId may not exist";

	}

}
