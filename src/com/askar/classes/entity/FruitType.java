package com.askar.classes.entity;

public enum FruitType {
    APPLE(1),
    BANANA(2),
    ORANGE(3),
    MANGO(4.5),
    PINEAPPLES(10.5),
    AVOCADO(5.5),
    KIWI(8.8),
    FEIJOA(11),
    TAMARILLO(1.2),
    GUARANA(2.2),
    PAPAYA(3.3),
    CANNON(4.4),
    GUAVA(2.8);

    private double calories;

    FruitType(double i) {
        calories = i;
    }

    public double getCalories() {
        return calories;
    }
}
