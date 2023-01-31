package com.simplediet.app.spoonacular.controller;

import com.simplediet.app.spoonacular.model.entity.product.InformationProduct;
import com.simplediet.app.webclient.dto.spooncular.SpoonacularDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final SpoonacularDTO spoonacularDTO;
    /**
     * @param id gets a long value representing the product ID in the Spoonacular database
     * @return the InformationProduct object retrieved from the Spoonacular API
     */
    @GetMapping("/information/{id}")
    @Cacheable(cacheNames = "informationProductById")
    public Object getInformationProduct(@PathVariable long id) {
        return spoonacularDTO.getProductById(id);
    }

    /**
     * @param searchValue accepts a String value in the form of a product name, e.g. pizza, yogurt, potato
     * @return basic information about the product and a list of the most popular products with their ID
     */
    @GetMapping("/search")
    @Cacheable(cacheNames = "productByStringQuery")
    public Object getProduct(@RequestParam String searchValue,
                             @RequestParam(required = false, defaultValue = "false") Boolean addProductInformation,
                             @RequestParam(required = false, defaultValue = "10") Integer number) {
        return spoonacularDTO.getProductBySearchValue(searchValue, addProductInformation, number);
    }

    /**
     * @param upcCode retrieves a String representing the UPC product code
     * @return the InformationProduct object retrieved from the Spoonacular API
     */
    @GetMapping("/upc/{upcCode}")
    public InformationProduct getInformationProductWithUpcCode(@PathVariable String upcCode) {
        return spoonacularDTO.getProductByUpcCode(upcCode);
    }
}
