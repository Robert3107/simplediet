package com.simplediet.app.model.entity.spoonacularingredients.basicentity;

public class EstimatedCost {
    private double value;
    private String unit;

    public EstimatedCost(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public EstimatedCost() {}

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
