package com.simplediet.app.spoonacular.model.entity.ingredients;

import java.util.List;

public class IngredientData {
    private int id;
    private String name;
    private String aisle;
    private List<String> possibleUnits;
    private List<Children> children;

    public IngredientData(int id, String name, String aisle, List<String> possibleUnits, List<Children> children) {
        this.id = id;
        this.name = name;
        this.aisle = aisle;
        this.possibleUnits = possibleUnits;
        this.children = children;
    }

    public IngredientData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAisle() {
        return aisle;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    public List<String> getPossibleUnits() {
        return possibleUnits;
    }

    public void setPossibleUnits(List<String> possibleUnits) {
        this.possibleUnits = possibleUnits;
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }
}