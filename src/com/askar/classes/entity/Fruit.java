package com.askar.classes.entity;

public class Fruit extends AbstractIngredient {

    private FruitType type;
    private boolean squeezed = false;
    private boolean acidic = false;


    public Fruit(FruitType type, int year, int month, int day, int cost, int amount,
                 int storedTemperature) {
        super(type.toString(), type.getCalories(), year, month, day, cost, amount, storedTemperature);
        this.type = type;
    }

    public Fruit(FruitType type, int year, int month, int day, int cost, int amount,
                 int storedTemperature, boolean squeezed, boolean acidic) {
        super(type.toString(), type.getCalories(), year, month, day, cost, amount, storedTemperature);
        this.type = type;
        this.squeezed = squeezed;
        this.acidic = acidic;
    }

    public FruitType getType() {
        return type;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    public boolean isSqueezed() {
        return squeezed;
    }

    public void setSqueezed(boolean squeezed) {
        this.squeezed = squeezed;
    }

    public boolean isAcidic() {
        return acidic;
    }

    public void setSugarAmount(int sugarAmount) {
        this.acidic = acidic;
    }

    @Override
    public String toString() {
        return super.toString() + "Fruit{" +
                "type=" + type +
                ", squeezed=" + squeezed +
                ", acidic=" + acidic +
                '}';
    }
}
