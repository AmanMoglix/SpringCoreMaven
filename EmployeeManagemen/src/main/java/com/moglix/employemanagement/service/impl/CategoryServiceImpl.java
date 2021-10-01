package com.moglix.employemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moglix.employemanagement.dao.CategoryDao;
import com.moglix.employemanagement.dao.impl.CategoryDaoImpl;
import com.moglix.employemanagement.domain.Category;
import com.moglix.employemanagement.service.CategoryService;

@Component
public class CategoryServiceImpl implements CategoryService {
	@Autowired
CategoryDao categoryDao;

@Override
	public String saveOrUpdate(Category category) {
		return categoryDao.saveOrUpdate(category);
	}

	@Override
	public Category getById(Long categoryId) {
		return categoryDao.getById(categoryId);
	}

	@Override
	public List<Category> getList() {
		return categoryDao.getList();
	}

	@Override
	public String deleteById(Long categoryId) {
		return categoryDao.deleteById(categoryId);		
	}

}
