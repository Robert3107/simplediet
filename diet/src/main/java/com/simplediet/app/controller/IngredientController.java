package com.simplediet.app.controller;

import com.simplediet.app.model.entity.spoonacularingredients.IngredientBasicObject;
import com.simplediet.app.webclient.dto.client.SpooncularClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ingredient")
public class IngredientController {

    private final SpooncularClient spooncularClient;

    @GetMapping("/search")
    public IngredientBasicObject getIngredientData(@RequestParam String query,
                                                   @RequestParam(required = false, defaultValue = "false") boolean addChildren,
                                                   @RequestParam(required = false, defaultValue = "false") boolean metaInformation,
                                                   @RequestParam(required = false, defaultValue = "asc") String sortDirection,
                                                   @RequestParam(required = false, defaultValue = "10") int number) {
        return spooncularClient.getIngredientData(query, addChildren, metaInformation, sortDirection, number);
    }
}
