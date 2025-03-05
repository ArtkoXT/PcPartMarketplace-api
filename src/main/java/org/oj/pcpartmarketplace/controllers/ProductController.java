package org.oj.pcpartmarketplace.controllers;

import lombok.Data;
import org.oj.pcpartmarketplace.entities.Product;
import org.oj.pcpartmarketplace.services.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
@Data
public class ProductController {

    ProductService productService;

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
}
