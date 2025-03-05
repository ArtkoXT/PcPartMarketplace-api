package org.oj.pcpartmarketplace.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.oj.pcpartmarketplace.entities.Product;
import org.oj.pcpartmarketplace.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class ProductService {

    ProductRepository productRepo;

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public Product createProduct(Product product){
        return productRepo.save(product);
    }


}
