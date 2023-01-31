package com.simplediet.app.spoonacular.model.entity.recipes;

import com.simplediet.app.spoonacular.model.entity.ingredients.Children;

import java.util.List;

public class Step {
    private int number;
    private String step;
    private List<Children> ingredients;
    private List<Equipment> equipment;

    public Step(int number, String step, List<Children> ingredients, List<Equipment> equipment) {
        this.number = number;
        this.step = step;
        this.ingredients = ingredients;
        this.equipment = equipment;
    }

    public Step() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public List<Children> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Children> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }
}
