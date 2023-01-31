package com.simplediet.app.spoonacular.model.entity.ingredients;

import com.simplediet.app.spoonacular.model.entity.product.Nutrients;

import java.util.List;

public class NutritionIngredients {
    private List<Nutrients> nutrients;
    private List<Property> properties;
    private List<Flavonoid> flavonoids;
    private CaloricBreakdown caloricBreakdown;
    private WeightPerServing weightPerServing;

    public NutritionIngredients(List<Nutrients> nutrients, List<Property> properties, List<Flavonoid> flavonoids,
                                CaloricBreakdown caloricBreakdown, WeightPerServing weightPerServing) {
        this.nutrients = nutrients;
        this.properties = properties;
        this.flavonoids = flavonoids;
        this.caloricBreakdown = caloricBreakdown;
        this.weightPerServing = weightPerServing;
    }

    public NutritionIngredients() {
    }

    public List<Nutrients> getNutrients() {
        return nutrients;
    }

    public void setNutrients(List<Nutrients> nutrients) {
        this.nutrients = nutrients;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public List<Flavonoid> getFlavonoids() {
        return flavonoids;
    }

    public void setFlavonoids(List<Flavonoid> flavonoids) {
        this.flavonoids = flavonoids;
    }

    public CaloricBreakdown getCaloricBreakdown() {
        return caloricBreakdown;
    }

    public void setCaloricBreakdown(CaloricBreakdown caloricBreakdown) {
        this.caloricBreakdown = caloricBreakdown;
    }

    public WeightPerServing getWeightPerServing() {
        return weightPerServing;
    }

    public void setWeightPerServing(WeightPerServing weightPerServing) {
        this.weightPerServing = weightPerServing;
    }
}
