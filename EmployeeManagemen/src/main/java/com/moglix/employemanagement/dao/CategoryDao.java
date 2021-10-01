package com.moglix.employemanagement.dao;

import java.util.List;

import com.moglix.employemanagement.domain.Category;



public interface CategoryDao {
	public String saveOrUpdate(Category category);

	public Category getById(Long categyId);

	public List<Category> getList();

	public String deleteById(Long categoryId);
}
