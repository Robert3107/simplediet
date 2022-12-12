package com.simplediet.app.model.entity.spoonacularproduct;

import java.util.ArrayList;

public class InformationProduct {
    private int id;
    private String title;
    private float price;
    private int likes;
    private ArrayList<String> badges;
    private ArrayList<String> importantBadges;
    private Nutrition nutrition;
    private float spoonacularScore;
    private ArrayList<String> breadcrumbs;
    private String aisle;
    private String description;
    private String generatedText;
    private String upc;
    private String brand;
    private int ingredientCount;
    private String ingredientList;

    public InformationProduct(int id, String title, float price, int likes, ArrayList<String> badges, ArrayList<String> importantBadges,
                              Nutrition nutrition, float spoonacularScore, ArrayList<String> breadcrumbs, String aisle, String description,
                              String generatedText, String upc, String brand, int ingredientCount, String ingredientList) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.likes = likes;
        this.badges = badges;
        this.importantBadges = importantBadges;
        this.nutrition = nutrition;
        this.spoonacularScore = spoonacularScore;
        this.breadcrumbs = breadcrumbs;
        this.aisle = aisle;
        this.description = description;
        this.generatedText = generatedText;
        this.upc = upc;
        this.brand = brand;
        this.ingredientCount = ingredientCount;
        this.ingredientList = ingredientList;
    }

    public InformationProduct() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<String> getBadges() {
        return badges;
    }

    public void setBadges(ArrayList<String> badges) {
        this.badges = badges;
    }

    public ArrayList<String> getImportantBadges() {
        return importantBadges;
    }

    public void setImportantBadges(ArrayList<String> importantBadges) {
        this.importantBadges = importantBadges;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    public float getSpoonacularScore() {
        return spoonacularScore;
    }

    public void setSpoonacularScore(float spoonacularScore) {
        this.spoonacularScore = spoonacularScore;
    }

    public ArrayList<String> getBreadcrumbs() {
        return breadcrumbs;
    }

    public void setBreadcrumbs(ArrayList<String> breadcrumbs) {
        this.breadcrumbs = breadcrumbs;
    }

    public String getAisle() {
        return aisle;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGeneratedText() {
        return generatedText;
    }

    public void setGeneratedText(String generatedText) {
        this.generatedText = generatedText;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getIngredientCount() {
        return ingredientCount;
    }

    public void setIngredientCount(int ingredientCount) {
        this.ingredientCount = ingredientCount;
    }

    public String getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(String ingredientList) {
        this.ingredientList = ingredientList;
    }
}