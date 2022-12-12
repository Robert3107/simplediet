package com.simplediet.app.model.entity.spoonacularproduct;

public class Nutrients {

    private long id;
    private String name;
    private float amount;
    private String unit;
    private float percentOfDailyNeeds;

    public Nutrients(String name, float amount, String unit, float percentOfDailyNeeds) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
        this.percentOfDailyNeeds = percentOfDailyNeeds;
    }

    public Nutrients() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public float getPercentOfDailyNeeds() {
        return percentOfDailyNeeds;
    }

    public void setPercentOfDailyNeeds(float percentOfDailyNeeds) {
        this.percentOfDailyNeeds = percentOfDailyNeeds;
    }
}
