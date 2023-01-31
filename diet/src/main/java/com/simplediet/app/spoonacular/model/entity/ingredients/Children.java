package com.simplediet.app.spoonacular.model.entity.ingredients;

public class Children {
    private long id;
    private String name;

    public Children(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Children() {
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
