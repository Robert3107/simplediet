package com.simplediet.app.model.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
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

    @NotEmpty(message = "Company name is required")
    private String name;

    @NotNull
    @NotEmpty(message = "Contact email is required")
    @Column(name = "contact_email")
    private String contactEmail;

    @NotNull
    @NotEmpty(message = "Company email is required")
    private String city;

    @NotNull
    @NotEmpty(message = "Street name in adress data is required")
    private String street;

    @NotNull
    @NotEmpty(message = "Building numer in adress data is required")
    @Column(name = "building_number")
    private String buildingNumber;

    @NotNull
    @NotEmpty(message = "Postal code in adress data is required")
    @Column(name = "postal_code")
    private String postalCode;

    @NotNull
    @NotEmpty(message = "NIP number in the company data is required")
    private String nip;
    private String regon;

    @NotNull
    @NotEmpty(message = "Phone number is required to contact with company")
    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "company_url")
    private String companyUrlSite;

    @Size(max = 255)
    @Column(name = "short_description")
    private String shortDescription;

    @Size(max = 1024)
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
