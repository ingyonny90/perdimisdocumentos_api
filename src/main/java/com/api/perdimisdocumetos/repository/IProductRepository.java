package com.api.perdimisdocumetos.repository;

import com.api.perdimisdocumetos.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProductRepository extends MongoRepository<Product, String> {
}
