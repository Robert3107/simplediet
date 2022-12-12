package com.simplediet.app.model.entity.spoonacularingredients;

import java.util.List;

public class IngredientBasicObject {
    private List<IngredientData> results;
    private int offset;
    private int number;
    private int totalResults;

    public IngredientBasicObject(List<IngredientData> results, int offset, int number, int totalResults) {
        this.results = results;
        this.offset = offset;
        this.number = number;
        this.totalResults = totalResults;
    }

    public IngredientBasicObject() {
    }

    public List<IngredientData> getResults() {
        return results;
    }

    public void setResults(List<IngredientData> results) {
        this.results = results;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
}
