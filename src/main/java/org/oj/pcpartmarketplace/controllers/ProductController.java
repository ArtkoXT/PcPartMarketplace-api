package org.oj.pcpartmarketplace.controllers;

import lombok.AllArgsConstructor;
import org.oj.pcpartmarketplace.entities.Product;
import org.oj.pcpartmarketplace.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {

    ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
}
