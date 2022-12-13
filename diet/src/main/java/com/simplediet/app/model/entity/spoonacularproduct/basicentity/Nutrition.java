package com.simplediet.app.model.entity.spoonacularproduct.basicentity;

import java.util.ArrayList;
import java.util.List;

public class Nutrition {

    private List<Nutrients> nutrients = new ArrayList<>();
    private float calories;
    private String fat;
    private String protien;
    private String carbs;

    public Nutrition(List<Nutrients> nutrients, float calories, String fat, String protien, String carbs) {
        this.nutrients = nutrients;
        this.calories = calories;
        this.fat = fat;
        this.protien = protien;
        this.carbs = carbs;
    }

    public Nutrition() {}

    public List<Nutrients> getNutrients() {
        return nutrients;
    }

    public void setNutrients(List<Nutrients> nutrients) {
        this.nutrients = nutrients;
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public String getFat() {
        return fat;
    }

    public void setFat(String fat) {
        this.fat = fat;
    }

    public String getProtien() {
        return protien;
    }

    public void setProtien(String protien) {
        this.protien = protien;
    }

    public String getCarbs() {
        return carbs;
    }

    public void setCarbs(String carbs) {
        this.carbs = carbs;
    }
}
