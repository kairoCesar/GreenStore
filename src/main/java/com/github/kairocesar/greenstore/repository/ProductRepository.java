package com.github.kairocesar.greenstore.repository;

import com.github.kairocesar.greenstore.entities.Product;
import com.github.kairocesar.greenstore.exceptions.ProductNotFoundException;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNullApi;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
