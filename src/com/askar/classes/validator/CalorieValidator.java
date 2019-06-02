package com.askar.classes.validator;

public class CalorieValidator {

    public static boolean isValid(double calorieAmount){
        return calorieAmount > 5 && calorieAmount < 10;
    }
}
