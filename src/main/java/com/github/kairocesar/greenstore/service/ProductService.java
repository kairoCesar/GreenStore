package com.github.kairocesar.greenstore.service;

import com.github.kairocesar.greenstore.dto.ProductDTO;
import com.github.kairocesar.greenstore.entities.Product;

import java.util.List;

public interface ProductService {

    List<ProductDTO> getList();

    ProductDTO search(Long id);

    Product add(ProductDTO product);

    boolean existsById(Long id);
}
