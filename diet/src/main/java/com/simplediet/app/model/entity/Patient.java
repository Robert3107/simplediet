package com.simplediet.app.model.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
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

    public Patient(Long id, Long userId, List<Visit> visits, List<Dietician> guardian, List<Diet> diets, List<Meals> favoriteMeals) {
        this.id = id;
        this.userId = userId;
        this.visits = visits;
        this.guardian = guardian;
        this.diets = diets;
        this.favoriteMeals = favoriteMeals;
    }

    public Patient() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public List<Dietician> getGuardian() {
        return guardian;
    }

    public void setGuardian(List<Dietician> guardian) {
        this.guardian = guardian;
    }

    public List<Diet> getDiets() {
        return diets;
    }

    public void setDiets(List<Diet> diets) {
        this.diets = diets;
    }

    public List<Meals> getFavoriteMeals() {
        return favoriteMeals;
    }

    public void setFavoriteMeals(List<Meals> favoriteMeals) {
        this.favoriteMeals = favoriteMeals;
    }
}
