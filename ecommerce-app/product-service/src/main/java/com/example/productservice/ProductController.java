package com.example.productservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {
    
    @GetMapping("/products")
    public List<Product> getProducts() {
        return Arrays.asList(new Product(1, "Laptop"), new Product(2, "Phone"));
    }   // Getters and setters omitted for brevity
}
