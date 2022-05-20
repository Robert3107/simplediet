package com.simplediet.app.model.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "data_user", indexes = {@Index(columnList = "id, userId, login")})
public class DataUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private long userId;
    @NotNull
    private String login;
    @NotNull
    private String password;
}
