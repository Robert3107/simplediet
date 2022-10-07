package com.simplediet.app.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "products", indexes = {@Index(columnList = "id, name, kcal")})
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Double weight;
    private Double portionSize;
    private Double kcal;
    private Double protein;
    private Double fat;
    @Column(name = "simple_carbohydrates")
    private Double simpleCarbohydrates;
    @Column(name = "complex_carbohydrates")
    private Double complexCarbohydrates;
}