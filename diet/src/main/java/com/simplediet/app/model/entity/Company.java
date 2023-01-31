package com.simplediet.app.model.entity;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
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

    @Column(name = "created_date", updatable = false)
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    public Company(Long id,
                   String name,
                   String contactEmail,
                   String city, String street,
                   String buildingNumber,
                   String postalCode,
                   String nip,
                   String regon,
                   String phoneNumber,
                   String companyUrlSite,
                   String shortDescription,
                   String description,
                   List<Specialisation> specialisations,
                   List<Certificate> certificates,
                   Date createdDate) {
        this.id = id;
        this.name = name;
        this.contactEmail = contactEmail;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.postalCode = postalCode;
        this.nip = nip;
        this.regon = regon;
        this.phoneNumber = phoneNumber;
        this.companyUrlSite = companyUrlSite;
        this.shortDescription = shortDescription;
        this.description = description;
        this.specialisations = specialisations;
        this.certificates = certificates;
        this.createdDate = createdDate;
    }

    public Company() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyUrlSite() {
        return companyUrlSite;
    }

    public void setCompanyUrlSite(String companyUrlSite) {
        this.companyUrlSite = companyUrlSite;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Specialisation> getSpecialisations() {
        return specialisations;
    }

    public void setSpecialisations(List<Specialisation> specialisations) {
        this.specialisations = specialisations;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
