package com.simplediet.app.model.entity.spoonacular.ingredients.basic;

public class WeightPerServing {
    private int amount;
    private String unit;

    public WeightPerServing(int amount, String unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public WeightPerServing() {}

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
