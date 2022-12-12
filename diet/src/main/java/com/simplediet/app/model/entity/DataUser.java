package com.simplediet.app.model.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "data_user", indexes = {@Index(columnList = "id, userId, login")})
public class DataUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long userId;
    @NotNull
    private String login;
    @NotNull
    private String password;

    public DataUser(Long id, Long userId, String login, String password) {
        this.id = id;
        this.userId = userId;
        this.login = login;
        this.password = password;
    }

    public DataUser() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
