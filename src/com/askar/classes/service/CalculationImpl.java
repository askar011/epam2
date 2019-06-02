package com.askar.classes.service;

import com.askar.classes.entity.AbstractIngredient;
import com.askar.classes.entity.Salad;
import com.askar.classes.validator.CalorieValidator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CalculationImpl implements SaladService {
    @Override
    public double sumOfCalorie(Salad salad) {
        double result = 0;
        for (AbstractIngredient elem : salad.getListOfIngrdients()) {
            result += elem.getCalories();
        }
        return result;
    }

    @Override
    public List<AbstractIngredient> intgredientsInRangeOfCalorie(Salad salad) {
        List<AbstractIngredient> resultList = new ArrayList<>();
        for (AbstractIngredient elem : salad.getListOfIngrdients()) {
            if (CalorieValidator.isValid(elem.getCalories())) {
                resultList.add(elem);
            }
        }
        return resultList;
    }

    @Override
    public List<AbstractIngredient> sortByCalorie(Salad salad) {
        List<AbstractIngredient> list = new ArrayList<>();
        list.addAll(salad.getListOfIngrdients());
        Collections.sort(list, Comparator.comparingDouble(AbstractIngredient::getCalories));
        return list;
    }
}
