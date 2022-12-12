package com.simplediet.app.model.entity.spoonacularproduct;

import java.util.ArrayList;
import java.util.List;

public class Product{

    private String type;
    private List<Object> products = new ArrayList<>();
    private int offset;
    private int number;
    private int totalProducts;
    private int processingTimeMs;
    private long expires;
    private boolean isStale;

    public Product(String type, List<Object> products, int offset, int number, int totalProducts, int processingTimeMs, long expires, boolean isStale) {
        this.type = type;
        this.products = products;
        this.offset = offset;
        this.number = number;
        this.totalProducts = totalProducts;
        this.processingTimeMs = processingTimeMs;
        this.expires = expires;
        this.isStale = isStale;
    }

    public Product() {}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Object> getProducts() {
        return products;
    }

    public void setProducts(List<Object> products) {
        this.products = products;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(int totalProducts) {
        this.totalProducts = totalProducts;
    }

    public int getProcessingTimeMs() {
        return processingTimeMs;
    }

    public void setProcessingTimeMs(int processingTimeMs) {
        this.processingTimeMs = processingTimeMs;
    }

    public long getExpires() {
        return expires;
    }

    public void setExpires(long expires) {
        this.expires = expires;
    }

    public boolean isStale() {
        return isStale;
    }

    public void setStale(boolean stale) {
        isStale = stale;
    }
}
