package com.dinesh.microservices.productservice.repository;

import com.dinesh.microservices.productservice.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Long> {

    // Additional query methods can be defined here if needed
    // For example, to find products by name:
    // List<Product> findByName(String name);
}
