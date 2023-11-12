package com.github.kairocesar.greenstore.domain.repository;

import com.github.kairocesar.greenstore.domain.entities.Product;
import com.github.kairocesar.greenstore.domain.entities.SalesOrder;

import java.util.List;

public interface ProductRepository {

    List<Product> getList();
}
