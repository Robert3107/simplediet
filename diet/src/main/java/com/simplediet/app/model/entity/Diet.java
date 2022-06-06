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
    @OneToMany
    @Column(name = "patient_diet_products")
    private List<Product> products = new ArrayList<>();
    private Long visit;

}