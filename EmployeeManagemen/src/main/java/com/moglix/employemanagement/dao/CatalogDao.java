package com.moglix.employemanagement.dao;

import java.util.List;

import com.moglix.employemanagement.domain.Catalog;



public interface CatalogDao {
	public String saveOrUpdate(Catalog catelog);

	public Catalog getById(Long catelogId);

	public List<Catalog> getList();

	public String  deleteById(Long catelogId);

}
