package com.simplediet.app.spoonacular.model.entity.recipes;

import java.util.List;

public class AnalyzedInstructions {

    public String name;
    public List<Step> steps;

    public AnalyzedInstructions(String name, List<Step> steps) {
        this.name = name;
        this.steps = steps;
    }

    public AnalyzedInstructions() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }
}
