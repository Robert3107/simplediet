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
@Table(name = "dieticians", indexes = {@Index(columnList = "id, user_id")})
public class Dietician {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @OneToMany
    @Column(name = "dietician_specialisations")
    private List<Specialisation> specialisations = new ArrayList<>();
    @OneToMany
    @Column(name = "dietician_certificates")
    private List<Certificate> certificate = new ArrayList<>();
    @OneToMany
    @Column(name = "dietician_companies")
    private List<Company> companies = new ArrayList<>();
}

