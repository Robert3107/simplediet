package com.simplediet.app.spoonacular.model.entity.recipes;

public class Measures {
    public Metric metric;
    public Us us;

    public Measures(Metric metric, Us us) {
        this.metric = metric;
        this.us = us;
    }

    public Measures() {
    }

    public Metric getMetric() {
        return metric;
    }

    public void setMetric(Metric metric) {
        this.metric = metric;
    }

    public Us getUs() {
        return us;
    }

    public void setUs(Us us) {
        this.us = us;
    }
}
