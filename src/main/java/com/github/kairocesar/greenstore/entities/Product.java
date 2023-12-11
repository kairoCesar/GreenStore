package com.github.kairocesar.greenstore.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String name;

    private double price;

    private long internalControlCode;

    public Product(){

    }

    public Product(String name, double price, long internalControlCode) {
        this.name = name;
        this.price = price;
        this.internalControlCode = internalControlCode;
    }
}
