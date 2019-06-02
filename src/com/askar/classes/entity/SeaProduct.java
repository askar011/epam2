package com.askar.classes.entity;

public class SeaProduct extends AbstractIngredient {

    private SeaProductType type;
    private boolean boiled = false;
    private boolean roasted = false;
    private boolean isAlive;

    public SeaProduct(SeaProductType type, int year, int month, int day, int cost, int amount,
                      int storedTemperature) {
        super(type.toString(), type.getCalories(), year, month, day, cost, amount, storedTemperature);
        this.type = type;
    }

    public SeaProduct(SeaProductType type, int year, int month, int day, int cost, int amount,
                      int storedTemperature, boolean isAlive) {
        super(type.toString(), type.getCalories(), year, month, day, cost, amount, storedTemperature);
        this.type = type;
        this.isAlive = isAlive;
    }

    public SeaProduct(SeaProductType type, int year, int month, int day, int cost,
                      int amount, int storedTemperature, boolean boiled, boolean roasted, boolean isAlive) {
        super(type.toString(), type.getCalories(), year, month, day, cost, amount, storedTemperature);
        this.type = type;
        this.boiled = boiled;
        this.roasted = roasted;
        this.isAlive = isAlive;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void setBoiled(boolean boiled) {
        this.boiled = boiled;
    }

    public boolean isRoasted() {
        return roasted;
    }

    public void setRoasted(boolean roasted) {
        this.roasted = roasted;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", boiled=" + boiled +
                ", roasted=" + roasted +
                ", isAlive=" + isAlive +
                '}';
    }
}
