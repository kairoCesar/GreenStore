package com.github.kairocesar.greenstore.domain.infraestructure.repository;

import com.github.kairocesar.greenstore.domain.entities.Product;

import com.github.kairocesar.greenstore.domain.repository.ProductRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductRepositoryImpl implements ProductRepository {

    @PersistenceContext
    EntityManager manager;

    @Override
    public List<Product> getList() {
        TypedQuery<Product> query = manager.createQuery("from Product", Product.class);
        return query.getResultList();
    }
}
