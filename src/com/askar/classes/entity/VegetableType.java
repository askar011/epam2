package com.askar.classes.entity;

public enum VegetableType {
    ABELMOSH(10.3),
    AVOCADO(10.5),
    ANGURIA(10.2),
    ARRACACA(11.2),
    ARROWROOT(11.5),
    ARTICHOKE(11.6),
    BASELLA(11.8),
    BASIL(11.9),
    EGGPLANT(12.3),
    OKRA(12.9);


    private double calories;

    VegetableType(double i) {
        calories = i;
    }

    public double getCalories() {
        return calories;
    }
}
