package com.simplediet.app.model.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "visits", indexes = {@Index(columnList = "id, patient_id, dietician_id")})
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "patient_id")
    private Long patientId;
    @Column(name = "dietician_id")
    private Long dieticianId;
    private Double price;
    @Column(name = "created_date", updatable = false)
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "visit_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date visitDate;

    public Visit(Long id, Long patientId, Long dieticianId, Double price, Date createdDate, Date visitDate) {
        this.id = id;
        this.patientId = patientId;
        this.dieticianId = dieticianId;
        this.price = price;
        this.createdDate = createdDate;
        this.visitDate = visitDate;
    }

    public Visit() {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }
}
