package com.simplediet.app.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
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
    @OneToMany
    @Column(name = "products_in_meal")
    private List<Product> products = new ArrayList<>();
}