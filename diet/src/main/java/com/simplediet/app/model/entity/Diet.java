package com.simplediet.app.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "diets", indexes = {@Index(columnList = "id, patient_id, dietician_id")})
public class Diet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "patient_id")
    private Long patientId;
    @Column(name = "dietician_id")
    private Long dieticianId;
    @OneToMany
    @Column(name = "patient_diet_meals")
    private List<Meals> meals = new ArrayList<>();

    public Diet(Long id, Long patientId, Long dieticianId, List<Meals> meals) {
        this.id = id;
        this.patientId = patientId;
        this.dieticianId = dieticianId;
        this.meals = meals;
    }

    public Diet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getDieticianId() {
        return dieticianId;
    }

    public void setDieticianId(Long dieticianId) {
        this.dieticianId = dieticianId;
    }

    public List<Meals> getMeals() {
        return meals;
    }

    public void setMeals(List<Meals> meals) {
        this.meals = meals;
    }
}