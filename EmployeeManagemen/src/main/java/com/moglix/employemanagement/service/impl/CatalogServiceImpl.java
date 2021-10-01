package com.moglix.employemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moglix.employemanagement.dao.CatalogDao;
import com.moglix.employemanagement.dao.impl.CatalogDaoImpl;
import com.moglix.employemanagement.domain.Catalog;
import com.moglix.employemanagement.service.CatalogService;
@Component
public class CatalogServiceImpl implements CatalogService {
	@Autowired
	CatalogDao catalogDao;


	@Override
	public String saveOrUpdate(Catalog catelog) {
		return catalogDao.saveOrUpdate(catelog);
	}

	@Override
	public Catalog getById(Long catelogId) {
		return catalogDao.getById(catelogId);
	}

	@Override
	public List<Catalog> getList() {
		return catalogDao.getList();
	}

	@Override
	public String deleteById(Long catelogId) {
		return catalogDao.deleteById(catelogId);
	}
}