package com.simplediet.app.controller.spoonacular;

import com.simplediet.app.model.entity.spoonacular.ingredients.InformationIngredient;
import com.simplediet.app.model.entity.spoonacular.ingredients.IngredientBasicObject;
import com.simplediet.app.model.entity.spoonacular.ingredients.IngredientConvertUnit;
import com.simplediet.app.model.entity.spoonacular.ingredients.basic.Flavonoid;
import com.simplediet.app.webclient.dto.spooncular.SpoonacularDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ingredient")
public class IngredientController {

    private final SpoonacularDTO spoonacularDTO;

    @GetMapping("/search")
    public IngredientBasicObject getIngredientData(
            @RequestParam String query,
            @RequestParam(required = false, defaultValue = "false") boolean addChildren,
            @RequestParam(required = false, defaultValue = "false") boolean metaInformation,
            @RequestParam(required = false, defaultValue = "asc") String sortDirection,
            @RequestParam(required = false, defaultValue = "10") int number
    ) {
        return spoonacularDTO.getIngredientByQuery(query, addChildren, metaInformation, sortDirection, number);
    }

    @GetMapping("/{id}/information")
    public InformationIngredient getInformationIngredient(
            @PathVariable long id,
            @RequestParam(required = false, defaultValue = "1") int amount,
            @RequestParam(required = false, defaultValue = "grams") String unit
    ) {
        return spoonacularDTO.getInformationIngredientById(id, amount, unit);
    }

    @GetMapping("/{id}/amount")
    public Flavonoid getComputeIngredientAmount(
            @PathVariable long id,
            @RequestParam(required = false, defaultValue = "protein") String nutrient,
            @RequestParam(required = false, defaultValue = "1") int target,
            @RequestParam(required = false, defaultValue = "oz") String unit
    ) {
        return spoonacularDTO.getComputeIngredientAmountById(id, nutrient, target, unit);
    }

    @GetMapping("/convert")
    public IngredientConvertUnit convertUnit(
            @RequestParam String ingredientName,
            @RequestParam(defaultValue = "1.0") double sourceAmount,
            @RequestParam(defaultValue = "cups") String sourceUnit,
            @RequestParam(defaultValue = "grams") String targetUnit
    ) {
        return spoonacularDTO.convertIngredientUnit(ingredientName, sourceAmount ,sourceUnit, targetUnit);
    }
}
