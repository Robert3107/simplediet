package com.simplediet.app.spoonacular.model.entity.product;

public class SpoonacularScore {
    private int id;
    private String title;
    private String image;
    private int difference;

    public SpoonacularScore(int difference, int id, String image, String title) {
        this.difference = difference;
        this.id = id;
        this.image = image;
        this.title = title;
    }

    public SpoonacularScore() {
    }

    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
