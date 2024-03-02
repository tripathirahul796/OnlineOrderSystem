package com.onlineordersystem.service.Category;

import java.util.List;

import com.onlineordersystem.entity.Category;

public interface CategoryService {
    public List<Category> getAllCategory();

    public Category getCategory(int categoryId);

    public String addCategory(List<Category> category);

    public String updateCategory(int categoryId);

    public String deleteCategory(int categoryId);

}
