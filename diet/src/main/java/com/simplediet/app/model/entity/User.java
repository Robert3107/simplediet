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
@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
