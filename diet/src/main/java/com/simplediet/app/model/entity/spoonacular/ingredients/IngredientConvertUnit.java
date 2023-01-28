package com.simplediet.app.model.entity.spoonacular.ingredients;

public class IngredientConvertUnit {
    private double sourceAmount;
    private String sourceUnit;
    private double targetAmount;
    private String targetUnit;
    private String answer;

    public IngredientConvertUnit(double sourceAmount, String sourceUnit, double targetAmount, String targetUnit, String answer) {
        this.sourceAmount = sourceAmount;
        this.sourceUnit = sourceUnit;
        this.targetAmount = targetAmount;
        this.targetUnit = targetUnit;
        this.answer = answer;
    }

    public IngredientConvertUnit() {}

    public double getSourceAmount() {
        return sourceAmount;
    }

    public void setSourceAmount(double sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    public String getSourceUnit() {
        return sourceUnit;
    }

    public void setSourceUnit(String sourceUnit) {
        this.sourceUnit = sourceUnit;
    }

    public double getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(double targetAmount) {
        this.targetAmount = targetAmount;
    }

    public String getTargetUnit() {
        return targetUnit;
    }

    public void setTargetUnit(String targetUnit) {
        this.targetUnit = targetUnit;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
