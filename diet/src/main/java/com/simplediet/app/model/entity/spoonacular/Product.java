package com.simplediet.app.model.entity.spoonacular;

import org.springframework.stereotype.Service;

import javax.persistence.*;

@Service
@Entity
@Table(name = "products", indexes = {@Index(columnList = "id, externalId, searchValue")})
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long externalId;
    private String searchValue;
    @Lob
    private String json;

    public Product(long id, long externalId, String searchValue, String json) {
        this.id = id;
        this.externalId = externalId;
        this.searchValue = searchValue;
        this.json = json;
    }

    public Product() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getExternalId() {
        return externalId;
    }

    public void setExternalId(long externalId) {
        this.externalId = externalId;
    }

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
}
