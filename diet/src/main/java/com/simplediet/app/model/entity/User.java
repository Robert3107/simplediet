package com.simplediet.app.model.entity;

import com.simplediet.app.model.types.AccountType;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    private String name;
    @NotNull
    private String surname;
    @NotNull
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;
    private String address;
    private String street;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "account_type")
    private AccountType accountType;
}
