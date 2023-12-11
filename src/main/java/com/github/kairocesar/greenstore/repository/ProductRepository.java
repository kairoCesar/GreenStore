package com.github.kairocesar.greenstore.repository;

import com.github.kairocesar.greenstore.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
