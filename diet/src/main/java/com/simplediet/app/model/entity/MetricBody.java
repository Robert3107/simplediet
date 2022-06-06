package com.simplediet.app.model.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "metric_body", indexes = {@Index(columnList = "id, patient_id")})
public class MetricBody {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = "patient_id")
    private Long patientId;
    private Integer age;
    private Integer height;
    private Double weight;
    private Double neck;
    private Double chest;
    private Double waits;
    private Double stomach;
    private Double hips;
    private Double arm;
    private Double forearm;
    private Double thigh;
    private Double calf;
    private Double metabolism;
    @Column(name = "body_fat")
    private Double bodyFat;
    @Column(name = "muscles_mass")
    private Double musclesMass;
    @Column(name = "bone_mass")
    private Double boneMass;
    @Column(name = "BMI")
    private Double bodyMassIndex;
    @Column(name = "FFM")
    private Double fatFreeMass;
    @Column(name = "BMR")
    private Double basalMetabolicRate;
    @Column(name = "TBW")
    private Double totalBalanceWater;
    @Column(name = "ECW")
    private Double extracellularWater;
    @Column(name = "ICW")
    private Double intracellularWater;
}
