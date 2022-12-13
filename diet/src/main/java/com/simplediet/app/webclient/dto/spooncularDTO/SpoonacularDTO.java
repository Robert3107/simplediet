package com.simplediet.app.webclient.dto.spooncularDTO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.simplediet.app.model.entity.spoonacularingredients.InformationIngredient;
import com.simplediet.app.model.entity.spoonacularingredients.IngredientBasicObject;
import com.simplediet.app.model.entity.spoonacularingredients.IngredientConvertUnit;
import com.simplediet.app.model.entity.spoonacularingredients.basicentity.Flavonoid;
import com.simplediet.app.model.entity.spoonacularproduct.BasicProductData;
import com.simplediet.app.model.entity.spoonacularproduct.InformationProduct;
import com.simplediet.app.model.entity.spoonacularproduct.basicentity.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class SpoonacularDTO {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private static final String SPOONCULAR_URL = "https://api.spoonacular.com";
    private static final String SPOONCULAR_PRODUCT_URL = "https://api.spoonacular.com/food/products";
    private static final String SPOONCULAR_INGREDIENTS_URL = "https://api.spoonacular.com/food/ingredients";
    private static final String API_KEY = "2d6514dae01e4847b6868ee84b9cf868";

    public InformationProduct getProductById(long id) {
        return convert(callGetMethod(SPOONCULAR_PRODUCT_URL, "/{id}", id), InformationProduct.class);
    }

    public InformationProduct getProductByUpcCode(String upc) {
        return convert(callGetMethod(SPOONCULAR_PRODUCT_URL, "/upc/{upc}", upc), InformationProduct.class);
    }

    public Product getProductByQuery(String query, boolean addProductInformation, int number) {
        Product product = new Product();
        if (addProductInformation) {
            product.setProducts(Collections.singletonList(BasicProductData.class));
            return convert(callGetMethod(SPOONCULAR_PRODUCT_URL,
                    "/search?query={query}&addProductInformation={addProductInformation}&number={number}",
                    query, true, number), Product.class);
        } else
            product.setProducts(Collections.singletonList(InformationProduct.class));
        return convert(callGetMethod(SPOONCULAR_PRODUCT_URL,
                "/search?query={query}&addProductInformation={addProductInformation}&number={number}",
                query, false, number), Product.class);
    }

    public IngredientBasicObject getIngredientByQuery(String query, boolean addChildren, boolean metaInformation, String sortDirection, int number) {
        return convert(callGetMethod(SPOONCULAR_INGREDIENTS_URL,
                "/search?query={query}&addChildren={addChildren}&metaInformation={metaInformation}&sortDirection={sortDirection}&number={number}",
                query, addChildren, metaInformation, sortDirection, number), IngredientBasicObject.class);
    }

    public InformationIngredient getInformationIngredientById(long id, int amount, String grams) {
        return convert(callGetMethod(SPOONCULAR_INGREDIENTS_URL,
                "/{id}/information?amount={amount}&unit={unit}",
                id, amount, grams), InformationIngredient.class);
    }

    public Flavonoid getComputeIngredientAmountById(long id, String nutrient, int target, String unit) {
        return convert(callGetMethod(SPOONCULAR_INGREDIENTS_URL,
                "/{id}/amount?nutrient={nutrient}&target={target}&unit={unit}",
                id, nutrient, target, unit), Flavonoid.class);
    }

    public IngredientConvertUnit convertIngredientUnit(String ingredientName, double sourceAmount, String sourceUnit, String targetUnit) {
        return convert(callGetMethod(SPOONCULAR_URL,
                "/recipes/convert?ingredientName={ingredientName}&sourceAmount={sourceAmount}&sourceUnit={sourceUnit}&targetUnit={targetUnit}",
                ingredientName, sourceAmount, sourceUnit, targetUnit), IngredientConvertUnit.class);
    }

    private String callGetMethod(String basicUri, String categoryUrl, Object... objects) {
        return basicRequestBuilder(basicUri).getForObject(categoryUrl, String.class, objects);
    }

    private String callPostMethod(String basicUri, String categoryUrl, Object body, Object... objects) {
        return basicRequestBuilder(basicUri).postForObject(categoryUrl, body, String.class, objects);
    }

    public RestTemplate basicRequestBuilder(String uri){
        return new RestTemplateBuilder()
                .rootUri(uri)
                .defaultHeader("x-api-key", API_KEY)
                .build();
    }
    /**
     *
     * @param json accepts json in String format returned by the Spoonacular API
     * @param deserializationClass takes a class parameter for target data serialization
     * @return an object of the class given as a parameter
     * @param <T> the generic type of the target class to which the json will be transformed
     */
    public <T> T convert(String json, Class<T> deserializationClass) {
        try {
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            return objectMapper.readValue(json, deserializationClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}