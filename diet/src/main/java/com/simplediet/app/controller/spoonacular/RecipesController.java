package com.simplediet.app.controller.spoonacular;

import com.simplediet.app.webclient.dto.spooncular.SpoonacularDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/recipes")
public class RecipesController {

    private final SpoonacularDTO spoonacularDTO;
}
