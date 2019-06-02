package com.askar.classes.entity;

public class Vegetable extends AbstractIngredient {

    private VegetableType vegetableType;
    private boolean grated = false;
    private double amountOfOil = 0;

    public Vegetable(VegetableType type, int year, int month, int day, int cost,
                     int amount, int storedTemperature) {
        super(type.toString(), type.getCalories(), year, month, day, cost, amount, storedTemperature);
        this.vegetableType = type;
    }

    public Vegetable(VegetableType vegetableType, int year, int month, int day, int cost, int amount,
                     int storedTemperature, boolean grated, double amountOfOil) {
        super(vegetableType.toString(), vegetableType.getCalories(), year, month, day, cost, amount, storedTemperature);
        this.vegetableType = vegetableType;
        this.grated = grated;
        this.amountOfOil = amountOfOil;
    }

    public Vegetable(VegetableType type, int year, int month, int day, int cost,
                     int amount, int storedTemperature, double amountOfOil) {
        super(type.toString(), type.getCalories(), year, month, day, cost, amount, storedTemperature);
        this.vegetableType = type;
        this.amountOfOil = amountOfOil;
    }


    public VegetableType getVegetableType() {
        return vegetableType;
    }

    public boolean isGrated() {
        return grated;
    }

    public void setGrated(boolean grated) {
        this.grated = grated;
    }

    public double getAmountOfOil() {
        return amountOfOil;
    }

    public void setAmountOfOil(double amountOfOil) {
        this.amountOfOil = amountOfOil;
    }

    @Override
    public String toString() {
        return super.toString() + "Vegetable{" +
                "grated=" + grated +
                ", amountOfOil=" + amountOfOil +
                '}';
    }
}
