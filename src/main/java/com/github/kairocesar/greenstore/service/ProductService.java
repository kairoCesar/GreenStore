package com.github.kairocesar.greenstore.service;

import com.github.kairocesar.greenstore.dto.ProductDTO;
import com.github.kairocesar.greenstore.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<ProductDTO> getList();

    ProductDTO search(Long id);

    Product add(Product product);

    boolean existsById(Long id);
}
