package com.moglix.employemanagement.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.moglix.employemanagement.dao.CatalogDao;
import com.moglix.employemanagement.domain.Catalog;


@Component
public class CatalogDaoImpl implements CatalogDao {


	List<Catalog> catalogList = new ArrayList();

	@Override
	public Catalog getById(Long catelogId) {
		
		Optional<Catalog> cata = 
				catalogList.stream().filter(it -> it.getProductId() == catelogId).findAny();
		if (cata.isPresent()) {
			return cata.get();
		}

		return null;
	}

	@Override
	public String deleteById(Long catelogId) {
		Catalog catalog = this.getById(catelogId);
		if (this.catalogList.contains(catalog)) {
			this.catalogList.remove(catalog);
			return "Deleted Successfull";
		}
		return "Not Deleted";
	}

//public String update(Long  catalogId,Catalog catalog){
//	Catalog cata=this.getById(catalogId);
//	int index =this.catalogList.indexOf(cata);
//
//	//int index =this.catalogList.indexOf(catalog);
//	this.catalogList.set(index, catalog);
//	return "Updated Successfully";
//}
	@Override
	public String saveOrUpdate(Catalog catalog) {
		if (this.getById(catalog.getProductId()) != null) {
			int index = this.catalogList.indexOf(this.getById(catalog.getProductId()));
			this.catalogList.set(index, catalog);
			return "Updated SuccessFully";
		} else
			catalogList.add(catalog);
		return "Persisted SuccessFully";
	}

	@Override
	public List<Catalog> getList() {
		return catalogList;
	}

}
