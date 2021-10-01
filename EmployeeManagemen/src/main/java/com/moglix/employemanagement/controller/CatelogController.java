package com.moglix.employemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.moglix.employemanagement.domain.Catalog;
import com.moglix.employemanagement.service.CatalogService;
import com.moglix.employemanagement.service.impl.CatalogServiceImpl;



public class CatelogController {
	@Autowired
	CatalogService catalogService ;

	public String saveOrUpdate(Catalog catalog) {
		return this.catalogService.saveOrUpdate(catalog);
	}

	public Catalog getById(Long catalogId) {
		return this.catalogService.getById(catalogId);
	}

	public List<Catalog> list() {
		return this.catalogService.getList();
	}

	public String delete(Long catalogId) {
		return this.catalogService.deleteById(catalogId);

	}
}
