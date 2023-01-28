package com.simplediet.app.model.entity.spoonacular.ingredients;

import com.simplediet.app.model.entity.spoonacular.ingredients.basic.EstimatedCost;
import com.simplediet.app.model.entity.spoonacular.product.basic.Nutrition;

import java.util.List;

public class InformationIngredient {
    private int id;
    private String original;
    private String originalName;
    private String name;
    private double amount;
    private String unit;
    private String unitShort;
    private String unitLong;
    private List<String> possibleUnits;
    private EstimatedCost estimatedCost;
    private String consistency;
    private List<String> shoppingListUnits;
    private String aisle;
    private String image;
    private List<Object> meta;
    private Nutrition nutrition;
    private List<String> categoryPath;

    public InformationIngredient(int id, String original, String originalName, String name, double amount,
                                 String unit, String unitShort, String unitLong, List<String> possibleUnits,
                                 EstimatedCost estimatedCost, String consistency, List<String> shoppingListUnits,
                                 String aisle, String image, List<Object> meta, Nutrition nutrition, List<String> categoryPath) {
        this.id = id;
        this.original = original;
        this.originalName = originalName;
        this.name = name;
        this.amount = amount;
        this.unit = unit;
        this.unitShort = unitShort;
        this.unitLong = unitLong;
        this.possibleUnits = possibleUnits;
        this.estimatedCost = estimatedCost;
        this.consistency = consistency;
        this.shoppingListUnits = shoppingListUnits;
        this.aisle = aisle;
        this.image = image;
        this.meta = meta;
        this.nutrition = nutrition;
        this.categoryPath = categoryPath;
    }

    public InformationIngredient() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitShort() {
        return unitShort;
    }

    public void setUnitShort(String unitShort) {
        this.unitShort = unitShort;
    }

    public String getUnitLong() {
        return unitLong;
    }

    public void setUnitLong(String unitLong) {
        this.unitLong = unitLong;
    }

    public List<String> getPossibleUnits() {
        return possibleUnits;
    }

    public void setPossibleUnits(List<String> possibleUnits) {
        this.possibleUnits = possibleUnits;
    }

    public EstimatedCost getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(EstimatedCost estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public String getConsistency() {
        return consistency;
    }

    public void setConsistency(String consistency) {
        this.consistency = consistency;
    }

    public List<String> getShoppingListUnits() {
        return shoppingListUnits;
    }

    public void setShoppingListUnits(List<String> shoppingListUnits) {
        this.shoppingListUnits = shoppingListUnits;
    }

    public String getAisle() {
        return aisle;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Object> getMeta() {
        return meta;
    }

    public void setMeta(List<Object> meta) {
        this.meta = meta;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    public List<String> getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(List<String> categoryPath) {
        this.categoryPath = categoryPath;
    }
}
