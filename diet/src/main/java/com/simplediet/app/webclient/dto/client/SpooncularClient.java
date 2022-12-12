package com.simplediet.app.webclient.dto.client;

import com.simplediet.app.model.entity.spoonacularingredients.IngredientBasicObject;
import com.simplediet.app.model.entity.spoonacularproduct.BasicProductData;
import com.simplediet.app.model.entity.spoonacularproduct.InformationProduct;
import com.simplediet.app.model.entity.spoonacularproduct.Product;
import com.simplediet.app.webclient.dto.spooncularDTO.SpoonacularDTO;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class SpooncularClient {

    private static final String SPOONCULAR_URL = "https://api.spoonacular.com";
    private static final String SPOONCULAR_PRODUCT_URL = "https://api.spoonacular.com/food/products";
    private static final String SPOONCULAR_INGREDIENTS_URL = "https://api.spoonacular.com/food/ingredients";
    private static final String API_KEY = "2d6514dae01e4847b6868ee84b9cf868";

    private final SpoonacularDTO spoonacularDTO = new SpoonacularDTO();

    public InformationProduct getProductInformation(long id) {
        return spoonacularDTO.convert(callGetMethod(SPOONCULAR_PRODUCT_URL, "/{id}", id), InformationProduct.class);
    }

    public InformationProduct getProductInformationWithUpcCode(String upc) {
        return spoonacularDTO.convert(callGetMethod(SPOONCULAR_PRODUCT_URL, "/upc/{upc}", upc), InformationProduct.class);
    }

    public Product getProduct(String query, boolean addProductInformation, int number) {
        Product product = new Product();
        if (addProductInformation) {
            product.setProducts(Collections.singletonList(BasicProductData.class));
            return spoonacularDTO.convert(callGetMethod(SPOONCULAR_PRODUCT_URL,
                    "/search?query={query}&addProductInformation={addProductInformation}&number={number}",
                    query, true, number), Product.class);
        } else
            product.setProducts(Collections.singletonList(InformationProduct.class));
        return spoonacularDTO.convert(callGetMethod(SPOONCULAR_PRODUCT_URL,
                "/search?query={query}&addProductInformation={addProductInformation}&number={number}",
                query, false, number), Product.class);
    }

    public IngredientBasicObject getIngredientData(String query, boolean addChildren, boolean metaInformation, String sortDirection, int number) {
        return spoonacularDTO.convert(callGetMethod(SPOONCULAR_INGREDIENTS_URL,
                "/search?query={query}&addChildren={addChildren}&metaInformation={metaInformation}&sortDirection={sortDirection}&number={number}",
                query, addChildren, metaInformation, sortDirection, number), IngredientBasicObject.class);
    }

    private String callGetMethod(String basicUri, String categoryUrl, Object... objects) {
        return new RestTemplateBuilder()
                .rootUri(basicUri)
                .defaultHeader("x-api-key", API_KEY)
                .build()
                .getForObject(categoryUrl, String.class, objects);
    }
}
