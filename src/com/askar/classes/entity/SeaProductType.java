package com.askar.classes.entity;

public enum SeaProductType {
    MARINEGRAPES(5.5),
    KRILL(5.5),
    KUKUMARIYA(24.5),
    ULVA(2.2),
    CRAB(19.2),
    MUSSEL(7.8),
    OYSTERS(10.2);

    private double calories;

    SeaProductType(double i) {
        calories = i;
    }

    public double getCalories() {
        return calories;
    }
}
