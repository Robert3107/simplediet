package com.simplediet.app.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
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
    @Column(name="transaction_date", updatable = false)
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
}
