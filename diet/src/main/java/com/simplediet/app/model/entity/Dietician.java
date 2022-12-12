package com.simplediet.app.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
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

    public Dietician(Long id, Long userId, List<Specialisation> specialisations, List<Certificate> certificate, List<Company> companies) {
        this.id = id;
        this.userId = userId;
        this.specialisations = specialisations;
        this.certificate = certificate;
        this.companies = companies;
    }

    public Dietician() {}

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

    public List<Specialisation> getSpecialisations() {
        return specialisations;
    }

    public void setSpecialisations(List<Specialisation> specialisations) {
        this.specialisations = specialisations;
    }

    public List<Certificate> getCertificate() {
        return certificate;
    }

    public void setCertificate(List<Certificate> certificate) {
        this.certificate = certificate;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}

