package com.simplediet.app.model.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "companies", indexes = {@Index(columnList = "id, phone_number, contact_email")})
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    @Column(name = "contact_email")
    private String contactEmail;
    private String city;
    private String street;
    @Column(name = "postal_code")
    private String postalCode;
    @NotNull
    private String nip;
    private String regon;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Size(max = 255)
    @Column(name = "short_description")
    private String shortDescription;
    private String description;
    @OneToMany
    private List<Specialisation> specialisations = new ArrayList<>();
    @OneToMany
    private List<Certificate> certificates = new ArrayList<>();

    @Column(name="created_date", updatable = false)
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
}
