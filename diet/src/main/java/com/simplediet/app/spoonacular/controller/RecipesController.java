package com.simplediet.app.spoonacular.controller;

import com.simplediet.app.spoonacular.model.entity.ingredients.ResultBasicObject;
import com.simplediet.app.spoonacular.model.entity.recipes.RecipeDetails;
import com.simplediet.app.webclient.dto.spooncular.SpoonacularDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/recipes")
public class RecipesController {

    private final SpoonacularDTO spoonacularDTO;

    @GetMapping("/search")
    @Cacheable(cacheNames = "recipesByQuery")
    public ResultBasicObject searchRecipesByQuery(@RequestParam String query,
                                                  @RequestParam(required = false, defaultValue = "european") String cuisines,
                                                  @RequestParam(required = false, defaultValue = "main course") String type,
                                                  @RequestParam(required = false, defaultValue = "10") int number) {
        return spoonacularDTO.getRecipesByQuery(query, cuisines, type, number);
    }

    @GetMapping("/details/{id}")
    public RecipeDetails searchRecipesDetailsById(@PathVariable long id) {
        return spoonacularDTO.getRecipesDetailsById(id);
    }

    @GetMapping("/details/multiply")
    public List<RecipeDetails> searchMultiplyRecipesDetailsById(@RequestParam String ids) {
        return spoonacularDTO.getRecipesDetailsById(ids);
    }
}
