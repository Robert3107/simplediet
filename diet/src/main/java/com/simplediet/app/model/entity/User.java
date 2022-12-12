package com.simplediet.app.model.entity;

import com.simplediet.app.model.types.AccountType;
import com.simplediet.app.model.types.Role;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "users", indexes = {@Index(columnList = "id, name, surname, email, phone_number, account_type")})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @NotEmpty(message = "User name is required")
    private String name;
    @NotNull
    @NotEmpty(message = "User surname is required")
    private String surname;
    @NotNull
    @NotEmpty(message = "Email is required")
    @Column(unique = true)
    private String email;
    @NotNull
    @NotEmpty(message = "Birthday date is required")
    @Column(name = "birthday_date")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date birthdayDate;
    @Column(name = "phone_number")
    private String phoneNumber;
    private String address;
    private String street;
    @Column(name = "building_number")
    private String buildingNumber;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "account_type")
    private AccountType accountType;
    private Role role;
    @Column(name = "created_date", updatable = false)
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    public User(Long id,
                String name,
                String surname,
                String email,
                Date birthdayDate,
                String phoneNumber,
                String address,
                String street,
                String buildingNumber,
                String postalCode,
                AccountType accountType,
                Role role,
                Date createdDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthdayDate = birthdayDate;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.postalCode = postalCode;
        this.accountType = accountType;
        this.role = role;
        this.createdDate = createdDate;
    }

    public User() {}

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(Date birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
