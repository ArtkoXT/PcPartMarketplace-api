package org.oj.pcpartmarketplace.services;

import lombok.AllArgsConstructor;
import org.oj.pcpartmarketplace.entities.Category;
import org.oj.pcpartmarketplace.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryService {

    CategoryRepository categoryRepo;

    public Category createCategory(Category category){
        return categoryRepo.save(category);
    }
}
