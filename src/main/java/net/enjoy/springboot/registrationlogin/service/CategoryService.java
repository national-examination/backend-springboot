package net.enjoy.springboot.registrationlogin.service;

import net.enjoy.springboot.registrationlogin.dto.CategoryDto;
import net.enjoy.springboot.registrationlogin.dto.UserDto;
import net.enjoy.springboot.registrationlogin.entity.Category;

import java.util.List;

public interface CategoryService {
    Category saveCategory(CategoryDto categoryDto);
    List<Category> listCategories();
}
