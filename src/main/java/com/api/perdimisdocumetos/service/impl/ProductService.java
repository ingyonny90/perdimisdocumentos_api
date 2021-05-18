package com.api.perdimisdocumetos.service.impl;

import com.api.perdimisdocumetos.model.Product;
import com.api.perdimisdocumetos.repository.IProductRepository;
import com.api.perdimisdocumetos.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
