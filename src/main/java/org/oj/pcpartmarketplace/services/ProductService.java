package org.oj.pcpartmarketplace.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.oj.pcpartmarketplace.entities.Product;
import org.oj.pcpartmarketplace.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
@Data
@AllArgsConstructor
public class ProductService {

    ProductRepository productRepo;

    public Product createProduct(Product product){
        return productRepo.save(product);
    }


}
