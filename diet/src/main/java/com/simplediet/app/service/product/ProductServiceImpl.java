package com.simplediet.app.service.product;

import com.google.gson.Gson;
import com.simplediet.app.model.entity.spoonacular.Product;
import com.simplediet.app.repository.spoonacular.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public void saveProductData(long id, Object object) {
        Product spoonacularProductInformation = new Product();
        spoonacularProductInformation.setExternalId(id);
        spoonacularProductInformation.setJson(new Gson().toJson(object));
        productRepository.save(spoonacularProductInformation);
    }

    @Override
    public void saveProductData(String searchValue, Object object) {
        Product spoonacularProductInformation = new Product();
        spoonacularProductInformation.setSearchValue(searchValue);
        spoonacularProductInformation.setJson(new Gson().toJson(object));
        productRepository.save(spoonacularProductInformation);
    }
}
