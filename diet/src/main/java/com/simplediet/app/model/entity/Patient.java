package com.simplediet.app.model.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "patients", indexes = {@Index(columnList = "id, user_id")})
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = "user_id")
    private Long userId;
    @OneToMany
    @Column(name = "patient_visits")
    private List<Visit> visits = new ArrayList<>();
    @OneToMany
    @Column(name = "patient_guardians")
    private List<Dietician> guardian = new ArrayList<>();
    @OneToMany
    @Column(name = "patient_diets")
    private List<Diet> diets = new ArrayList<>();
    @OneToMany
    @Column(name = "patient_favorite_meals")
    private List<Meals> favoriteMeals = new ArrayList<>();
    @OneToMany
    @Column(name = "patient_favorite_products")
    private List<Product> favoriteProducts = new ArrayList<>();
}
