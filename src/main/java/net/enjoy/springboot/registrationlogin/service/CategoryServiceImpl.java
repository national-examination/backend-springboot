package net.enjoy.springboot.registrationlogin.service;

import net.enjoy.springboot.registrationlogin.dto.CategoryDto;
import net.enjoy.springboot.registrationlogin.entity.Category;
import net.enjoy.springboot.registrationlogin.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(CategoryDto categoryDto){
        Category category = new Category();
        category.setName(categoryDto.getName());
        Category newCategory = categoryRepository.save(category);
        return newCategory;
    }

    @Override
    public List<Category> listCategories(){
        return categoryRepository.findAll();
    }
}
