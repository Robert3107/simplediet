package com.simplediet.app.model.entity.spoonacularingredients;

public class IngredientChildren {
    private long id;
    private String name;

    public IngredientChildren(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public IngredientChildren() {
    }

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
}
