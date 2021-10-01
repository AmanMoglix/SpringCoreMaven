package com.moglix.employemanagement.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.moglix.employemanagement.dao.CategoryDao;
import com.moglix.employemanagement.domain.Category;

@Component
public class CategoryDaoImpl implements CategoryDao {

	private List<Category> categories = new ArrayList<Category>();

	@Override
	public String saveOrUpdate(Category category) {
		if (this.getById(category.getCategoryId()) != null) {
			for (Category cat : categories) {
				if (cat.getCategoryId() == category.getCategoryId()) {
					cat.setCategoryName(category.getCategoryName());
					return "Updated Successfully ";
				}
			}
		} else {
//			if(counter<categories.length) {
//				categories[counter]=category;
//			}
			this.categories.add(category);
		}
		return "Inserted Successfully";
	}

	@Override
	public Category getById(Long categyId) {
		for (Category category : categories) {
			if (category != null && category.getCategoryId() == categyId) {
				return category;
			}
		}
		return null;
	}

	@Override
	public List<Category> getList() {
		return categories;
	}

	@Override
	public String deleteById(Long categoryId) {
		Category category = this.getById(categoryId);
		if (category != null) {
			this.categories.remove(category);
			return "Deleted Successfull with categoryId " + categoryId + "";
		} else
			return "Internal Server error OR catalogId may not exist";

//		this.counter=0;
//		for (Category category : categories) {
//		if(category!=null && category.getCategoryId()==categoryId) {
//			categories[counter]=null;
//			return "Deleted Successfull with categoryId "+categoryId+"";
//		}else {
//			counter++;
//		}
//	}
//	       return "Internal Server error OR catalogId may not exist";
	}

}
