package com.moglix.employemanagement.service;

import java.util.List;

import com.moglix.employemanagement.domain.Catalog;



public interface CatalogService {
	public String saveOrUpdate(Catalog catelog);

	public Catalog getById(Long catelogId);

	public List<Catalog> getList();

	public String deleteById(Long catelogId);
}
