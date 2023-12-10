package com.github.kairocesar.greenstore.dto;

import com.github.kairocesar.greenstore.exceptions.InvalidValueException;
import jakarta.annotation.Nonnull;

public record ProductDTO(@Nonnull String name, @Nonnull double price) {

    public ProductDTO{

    }

    private void validateName(String name) {
        if (name.isEmpty()) {
            throw new InvalidValueException("Name cannot be empty");
        }
    }

    private void validatePrice(double price) {
        if (price <= 0) {
            throw new InvalidValueException("Price cannot be equal or less than 0");
        }
    }
}
