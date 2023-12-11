package com.github.kairocesar.greenstore.dto;

import jakarta.annotation.Nonnull;

public record ProductDTO(@Nonnull String name, @Nonnull double price) {

    public ProductDTO{
    }
}
