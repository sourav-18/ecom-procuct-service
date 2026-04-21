package com.ms.product_service.controllers;

import com.ms.product_service.domins.Product;
import com.ms.product_service.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {

    private  final ProductRepository repository;

    @GetMapping
    public String getProduct(){
        return "ok";
    }

    @PostMapping
    public Product create(@RequestBody Product product){
        repository.save(product);
        return product;
    }
}
