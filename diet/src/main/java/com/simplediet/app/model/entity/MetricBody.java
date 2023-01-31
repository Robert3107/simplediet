package com.simplediet.app.model.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "metric_body", indexes = {@Index(columnList = "id, patient_id")})
public class MetricBody {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = "patient_id")
    private Long patientId;
    @NotNull
    @NotEmpty(message = "Age is required")
    private Integer age;
    @NotNull
    @NotEmpty(message = "User sex is required")
    private String sex;
    private Integer height;
    private Double weight;
    private Double neck;
    private Double chest;
    private Double waits;
    private Double stomachWaits;
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

    public MetricBody(Long id,
                      Long patientId,
                      Integer age,
                      String sex,
                      Integer height,
                      Double weight,
                      Double neck,
                      Double chest,
                      Double waits,
                      Double stomachWaits,
                      Double hips,
                      Double arm,
                      Double forearm,
                      Double thigh,
                      Double calf,
                      Double metabolism,
                      Double bodyFat,
                      Double musclesMass,
                      Double boneMass,
                      Double bodyMassIndex,
                      Double fatFreeMass,
                      Double basalMetabolicRate,
                      Double totalBalanceWater,
                      Double extracellularWater,
                      Double intracellularWater) {
        this.id = id;
        this.patientId = patientId;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.neck = neck;
        this.chest = chest;
        this.waits = waits;
        this.stomachWaits = stomachWaits;
        this.hips = hips;
        this.arm = arm;
        this.forearm = forearm;
        this.thigh = thigh;
        this.calf = calf;
        this.metabolism = metabolism;
        this.bodyFat = bodyFat;
        this.musclesMass = musclesMass;
        this.boneMass = boneMass;
        this.bodyMassIndex = bodyMassIndex;
        this.fatFreeMass = fatFreeMass;
        this.basalMetabolicRate = basalMetabolicRate;
        this.totalBalanceWater = totalBalanceWater;
        this.extracellularWater = extracellularWater;
        this.intracellularWater = intracellularWater;
    }

    public MetricBody() {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getNeck() {
        return neck;
    }

    public void setNeck(Double neck) {
        this.neck = neck;
    }

    public Double getChest() {
        return chest;
    }

    public void setChest(Double chest) {
        this.chest = chest;
    }

    public Double getWaits() {
        return waits;
    }

    public void setWaits(Double waits) {
        this.waits = waits;
    }

    public Double getStomachWaits() {
        return stomachWaits;
    }

    public void setStomachWaits(Double stomachWaits) {
        this.stomachWaits = stomachWaits;
    }

    public Double getHips() {
        return hips;
    }

    public void setHips(Double hips) {
        this.hips = hips;
    }

    public Double getArm() {
        return arm;
    }

    public void setArm(Double arm) {
        this.arm = arm;
    }

    public Double getForearm() {
        return forearm;
    }

    public void setForearm(Double forearm) {
        this.forearm = forearm;
    }

    public Double getThigh() {
        return thigh;
    }

    public void setThigh(Double thigh) {
        this.thigh = thigh;
    }

    public Double getCalf() {
        return calf;
    }

    public void setCalf(Double calf) {
        this.calf = calf;
    }

    public Double getMetabolism() {
        return metabolism;
    }

    public void setMetabolism(Double metabolism) {
        this.metabolism = metabolism;
    }

    public Double getBodyFat() {
        return bodyFat;
    }

    public void setBodyFat(Double bodyFat) {
        this.bodyFat = bodyFat;
    }

    public Double getMusclesMass() {
        return musclesMass;
    }

    public void setMusclesMass(Double musclesMass) {
        this.musclesMass = musclesMass;
    }

    public Double getBoneMass() {
        return boneMass;
    }

    public void setBoneMass(Double boneMass) {
        this.boneMass = boneMass;
    }

    public Double getBodyMassIndex() {
        return bodyMassIndex;
    }

    public void setBodyMassIndex(Double bodyMassIndex) {
        this.bodyMassIndex = bodyMassIndex;
    }

    public Double getFatFreeMass() {
        return fatFreeMass;
    }

    public void setFatFreeMass(Double fatFreeMass) {
        this.fatFreeMass = fatFreeMass;
    }

    public Double getBasalMetabolicRate() {
        return basalMetabolicRate;
    }

    public void setBasalMetabolicRate(Double basalMetabolicRate) {
        this.basalMetabolicRate = basalMetabolicRate;
    }

    public Double getTotalBalanceWater() {
        return totalBalanceWater;
    }

    public void setTotalBalanceWater(Double totalBalanceWater) {
        this.totalBalanceWater = totalBalanceWater;
    }

    public Double getExtracellularWater() {
        return extracellularWater;
    }

    public void setExtracellularWater(Double extracellularWater) {
        this.extracellularWater = extracellularWater;
    }

    public Double getIntracellularWater() {
        return intracellularWater;
    }

    public void setIntracellularWater(Double intracellularWater) {
        this.intracellularWater = intracellularWater;
    }
}
