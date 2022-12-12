package com.simplediet.app.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "meals", indexes = {@Index(columnList = "id, name, kcal")})
public class Meals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Double weight;
    @Column(name = "portion_size")
    private Double portionSize;
    private Double kcal;
    private Double protein;
    private Double fat;
    @Column(name = "simple_carbohydrates")
    private Double simpleCarbohydrates;
    @Column(name = "complex_carbohydrates")
    private Double complexCarbohydrates;

    public Meals(long id,
                 String name,
                 Double weight,
                 Double portionSize,
                 Double kcal,
                 Double protein,
                 Double fat,
                 Double simpleCarbohydrates,
                 Double complexCarbohydrates) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.portionSize = portionSize;
        this.kcal = kcal;
        this.protein = protein;
        this.fat = fat;
        this.simpleCarbohydrates = simpleCarbohydrates;
        this.complexCarbohydrates = complexCarbohydrates;
    }

    public Meals() {}

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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPortionSize() {
        return portionSize;
    }

    public void setPortionSize(Double portionSize) {
        this.portionSize = portionSize;
    }

    public Double getKcal() {
        return kcal;
    }

    public void setKcal(Double kcal) {
        this.kcal = kcal;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public Double getFat() {
        return fat;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public Double getSimpleCarbohydrates() {
        return simpleCarbohydrates;
    }

    public void setSimpleCarbohydrates(Double simpleCarbohydrates) {
        this.simpleCarbohydrates = simpleCarbohydrates;
    }

    public Double getComplexCarbohydrates() {
        return complexCarbohydrates;
    }

    public void setComplexCarbohydrates(Double complexCarbohydrates) {
        this.complexCarbohydrates = complexCarbohydrates;
    }
}