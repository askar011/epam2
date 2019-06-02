package com.askar.classes.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Salad {

    private static final Logger LOGGER = LogManager.getLogger();
    private String name;
    private List<AbstractIngredient> listOfIngrdients = new ArrayList<>();

    public Salad(String name) {
        this.name = name;
    }

    public void addIngredient(AbstractIngredient ingredient) {
        LOGGER.info(ingredient.getName() + " added");
        listOfIngrdients.add(ingredient);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AbstractIngredient> getListOfIngrdients() {
        return Collections.unmodifiableList(listOfIngrdients);
    }

    @Override
    public String toString() {
        return "Salad{" +
                "name='" + name + '\'' +
                ", listOfIngrdients=" + listOfIngrdients +
                '}';
    }
}
