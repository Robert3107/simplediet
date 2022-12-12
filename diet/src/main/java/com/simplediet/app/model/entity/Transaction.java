package com.simplediet.app.model.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transactions", indexes = {@Index(columnList = "id, patient_id, payment_id")})
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "patient_id")
    private Long patientId;
    @Column(name = "diet_id")
    private Long dietId;
    @Column(name = "dietician_id")
    private Long dieticianId;
    @Column(name = "payment_id")
    private Long paymentId;
    private Double price;
    @Column(name = "transaction_date", updatable = false)
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;

    public Transaction(Long id, Long patientId, Long dietId, Long dieticianId, Long paymentId, Double price, Date transactionDate) {
        this.id = id;
        this.patientId = patientId;
        this.dietId = dietId;
        this.dieticianId = dieticianId;
        this.paymentId = paymentId;
        this.price = price;
        this.transactionDate = transactionDate;
    }

    public Transaction() {
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

    public Long getDietId() {
        return dietId;
    }

    public void setDietId(Long dietId) {
        this.dietId = dietId;
    }

    public Long getDieticianId() {
        return dieticianId;
    }

    public void setDieticianId(Long dieticianId) {
        this.dieticianId = dieticianId;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
