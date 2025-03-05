package org.oj.pcpartmarketplace.controllers;

import lombok.AllArgsConstructor;
import org.oj.pcpartmarketplace.entities.Product;
import org.oj.pcpartmarketplace.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {

    ProductService productService;

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
}
