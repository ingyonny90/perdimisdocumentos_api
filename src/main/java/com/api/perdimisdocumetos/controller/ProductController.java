package com.api.perdimisdocumetos.controller;

import com.api.perdimisdocumetos.model.Product;
import com.api.perdimisdocumetos.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private IProductService productService;

    @PostMapping(value = "/product",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createProduct(@RequestBody Product product) {
        productService.saveProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping(value = "/productList")
    public ResponseEntity<List<Product>> findProduct() {
        return new ResponseEntity(productService.getAllProduct(),HttpStatus.OK);
    }


}
