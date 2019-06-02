package com.askar.classes.service;

import com.askar.classes.entity.AbstractIngredient;
import com.askar.classes.entity.Salad;

import java.util.List;

public interface SaladService {
    double sumOfCalorie(Salad salad);

    List<AbstractIngredient> intgredientsInRangeOfCalorie(Salad salad);

    List<AbstractIngredient> sortByCalorie(Salad salad);
}
