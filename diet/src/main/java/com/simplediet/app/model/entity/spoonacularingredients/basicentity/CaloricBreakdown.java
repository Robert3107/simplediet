package com.simplediet.app.model.entity.spoonacularingredients.basicentity;

public class CaloricBreakdown {
    private double percentProtein;
    private double percentFat;
    private double percentCarbs;

    public CaloricBreakdown(double percentProtein, double percentFat, double percentCarbs) {
        this.percentProtein = percentProtein;
        this.percentFat = percentFat;
        this.percentCarbs = percentCarbs;
    }

    public CaloricBreakdown() {}

    public double getPercentProtein() {
        return percentProtein;
    }

    public void setPercentProtein(double percentProtein) {
        this.percentProtein = percentProtein;
    }

    public double getPercentFat() {
        return percentFat;
    }

    public void setPercentFat(double percentFat) {
        this.percentFat = percentFat;
    }

    public double getPercentCarbs() {
        return percentCarbs;
    }

    public void setPercentCarbs(double percentCarbs) {
        this.percentCarbs = percentCarbs;
    }
}
