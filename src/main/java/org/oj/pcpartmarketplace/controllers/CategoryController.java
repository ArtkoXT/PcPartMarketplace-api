package org.oj.pcpartmarketplace.controllers;

import lombok.AllArgsConstructor;
import org.oj.pcpartmarketplace.entities.Category;
import org.oj.pcpartmarketplace.services.CategoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
class CategoryController {

    CategoryService categoryService;

    @PostMapping("/add")
    public Category addCategory(@RequestBody Category category){
        return categoryService.createCategory(category);
    }
}
