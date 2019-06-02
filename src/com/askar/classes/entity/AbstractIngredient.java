package com.askar.classes.entity;

import com.askar.classes.exception.DateException;
import com.askar.classes.validator.DateValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public abstract class AbstractIngredient {

    private static final Logger LOGGER = LogManager.getLogger();
    private String name;
    private double calories;
    private Date expireDate;
    private int cost;
    private int amount;
    private int storedTemperature;

    public AbstractIngredient(String name, double calories, int year, int month, int day, int cost,
                              int amount, int storedTemperature) {
        this.name = name;
        this.calories = calories;
        this.cost = cost;
        this.amount = amount;
        this.storedTemperature = storedTemperature;
        initExpireDate(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public int getCost() {
        return cost;
    }

    public int getAmount() {
        return amount;
    }

    public int getStoredTemperature() {
        return storedTemperature;
    }

    private void initExpireDate(int year, int month, int day) {
        if (DateValidator.isValid(year, month, day)) {
            Calendar cal = Calendar.getInstance();
            cal.set(year, month - 1, day, 0, 0, 0);
            expireDate = cal.getTime();
        } else {
            try {
                throw new DateException();
            } catch (DateException e) {
                LOGGER.error(e);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractIngredient that = (AbstractIngredient) o;
        return calories == that.calories &&
                cost == that.cost &&
                amount == that.amount &&
                storedTemperature == that.storedTemperature &&
                Objects.equals(name, that.name) &&
                Objects.equals(expireDate, that.expireDate);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "AbstractIngredient{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", expireDate=" + expireDate +
                ", cost=" + cost +
                ", amount=" + amount +
                ", storedTemperature=" + storedTemperature +
                '}';
    }
}
