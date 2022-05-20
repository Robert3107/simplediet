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
@Table(name = "metric_body", indexes = {@Index(columnList = "id, userId")})
public class MetricBody {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private long userId;
    private int age;
    private String sex;
    private int height;
    private double weight;
    private double neck;
    private double chest;
    private double waits;
    private double stomach;
    private double hips;
    private double arm;
    private double forearm;
    private double thigh;
    private double calf;
    private double bmi;
    private double metabolism;
    private double bodyFat;
}
