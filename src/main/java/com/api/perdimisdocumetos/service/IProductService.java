package com.api.perdimisdocumetos.service;

import com.api.perdimisdocumetos.model.Product;

import java.util.List;

public interface IProductService {

    void saveProduct(Product product);
    List<Product> getAllProduct();
}
