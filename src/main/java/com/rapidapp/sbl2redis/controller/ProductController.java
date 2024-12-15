package com.rapidapp.sbl2redis.controller;

import com.rapidapp.sbl2redis.model.CreateProductRequest;
import com.rapidapp.sbl2redis.model.Product;
import com.rapidapp.sbl2redis.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    @PostMapping
    public Product createProduct(@RequestBody CreateProductRequest request) {
        Product product = Product.builder()
                .name(request.getName())
                .description(request.getDescription())
                .price(request.getPrice())
                .build();
        return productRepository.save(product);
    }
}
