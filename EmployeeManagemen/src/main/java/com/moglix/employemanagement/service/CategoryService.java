package com.moglix.employemanagement.service;

import java.util.List;

import com.moglix.employemanagement.domain.Category;



public interface CategoryService {
	public String saveOrUpdate(Category category);

	public Category getById(Long categoryId);

	public List<Category> getList();

	public String deleteById(Long categoryId);
}
