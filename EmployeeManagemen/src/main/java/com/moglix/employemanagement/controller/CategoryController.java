package com.moglix.employemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.moglix.employemanagement.domain.Category;
import com.moglix.employemanagement.service.CategoryService;



public class CategoryController {
	@Autowired
	CategoryService categoryService ;

	public String saveOrUpdate(Category category) {
		return this.categoryService.saveOrUpdate(category);
	}

	public Category getById(Long categoryId) {
		return this.categoryService.getById(categoryId);
	}

	public List<Category> list() {
		return this.categoryService.getList();
	}

	public String delete(Long categoryId) {
	return	this.categoryService.deleteById(categoryId);
	}
}
