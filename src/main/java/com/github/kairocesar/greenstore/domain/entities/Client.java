package com.github.kairocesar.greenstore.domain.entities;

import com.github.kairocesar.greenstore.exceptions.InvalidValueException;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Objects;

@Data
@Entity
public class Client {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String name;

    private int age;

    public void setName(String name) {
        if (name.isEmpty() || Objects.isNull(name)) {
            throw new InvalidValueException("Name can't be null or empty!");
        }
    }

    public void setAge(int age) {
        if (age < 18) {
            throw new InvalidValueException("We do not sell to anyone under 18 years old");
        }
    }
}
