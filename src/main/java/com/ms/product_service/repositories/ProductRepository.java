package com.ms.product_service.repositories;

import com.ms.product_service.domins.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Set;

public interface ProductRepository extends MongoRepository<Product,String> {

    List<Product> findByIdIn(Set<String> ids);

}
