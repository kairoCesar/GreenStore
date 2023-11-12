package com.github.kairocesar.greenstore.service;

import com.github.kairocesar.greenstore.domain.entities.Product;
import com.github.kairocesar.greenstore.domain.repository.ProductRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductQueryService {

    ProductRepository productRepository;

    @Autowired
    public ProductQueryService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getList() {
        return productRepository.getList();
    }
}
