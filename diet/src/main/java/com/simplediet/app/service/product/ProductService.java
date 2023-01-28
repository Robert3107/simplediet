package com.simplediet.app.service.product;

public interface ProductService {

    void saveProductData(long id, Object object);

    void saveProductData(String query, Object object);

}
