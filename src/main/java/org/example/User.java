package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

enum Sex {
    MALE, FEMALE
}

@Getter
@Setter
@SuperBuilder
public class User {
    private String name;
    private int age;
    private Sex sex;
    private double weight;
    private double height;
}