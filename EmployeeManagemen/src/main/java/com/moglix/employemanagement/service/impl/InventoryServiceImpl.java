package com.moglix.employemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moglix.employemanagement.dao.InventoryDao;
import com.moglix.employemanagement.dao.impl.InventoryDaoImpl;
import com.moglix.employemanagement.domain.Inventory;
import com.moglix.employemanagement.service.InventoryService;


@Component
public class InventoryServiceImpl implements InventoryService {
	@Autowired
	InventoryDao inventoryDao ;
	

	@Override
	public String saveOrUpdate(Inventory inventory) {
		return inventoryDao.saveOrUpdate(inventory);
	}

	@Override
	public Inventory getById(Long inventoryId) {
		return inventoryDao.getById(inventoryId);
	}

	@Override
	public List<Inventory> getList() {
		return inventoryDao.getList();
	}

	@Override
	public String deleteById(Long inventoryId) {
		return inventoryDao.deleteById(inventoryId);
	}

}
