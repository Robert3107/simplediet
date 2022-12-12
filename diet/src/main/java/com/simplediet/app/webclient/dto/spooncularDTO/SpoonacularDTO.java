package com.simplediet.app.webclient.dto.spooncularDTO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class SpoonacularDTO {

    private final ObjectMapper objectMapper = new ObjectMapper();

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