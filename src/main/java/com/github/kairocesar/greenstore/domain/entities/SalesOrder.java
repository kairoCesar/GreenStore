package com.github.kairocesar.greenstore.domain.entities;

import jakarta.persistence.*;

@Entity
public class SalesOrder {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private double totalOrderValue;

    @ManyToOne
    private Product product;

    @OneToOne
    private Client client;
}
