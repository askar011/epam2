package com.askar.classes.validator;

public class DateValidator {

    public static boolean isValid(int year, int month, int day) {
        return year > 0 && month > 0 && day > 0;
    }
}
