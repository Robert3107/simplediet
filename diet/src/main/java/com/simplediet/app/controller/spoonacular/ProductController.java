package com.simplediet.app.controller.spoonacular;

import com.simplediet.app.model.entity.spoonacular.product.InformationProduct;
import com.simplediet.app.model.entity.spoonacular.product.basic.SpoonacularProduct;
import com.simplediet.app.repository.spoonacular.ProductRepository;
import com.simplediet.app.service.product.ProductServiceImpl;
import com.simplediet.app.webclient.dto.spooncular.SpoonacularDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final SpoonacularDTO spoonacularDTO;
    private final ProductRepository productRepository;
    private final ProductServiceImpl productService;

    /**
     * @param id gets a long value representing the product ID in the Spoonacular database
     * @return the InformationProduct object retrieved from the Spoonacular API
     */
    @GetMapping("/information/{id}")
    public Object getInformationProduct(@PathVariable long id) {
        if (Objects.nonNull(productRepository.findByExternalId(id))) {
            return productRepository.findByExternalId(id).getJson();
        } else {
            InformationProduct informationProduct = spoonacularDTO.getProductById(id);
            productService.saveProductData(id, informationProduct);
            return informationProduct;
        }
    }

    /**
     * @param searchValue accepts a String value in the form of a product name, e.g. pizza, yogurt, potato
     * @return basic information about the product and a list of the most popular products with their ID
     */
    @GetMapping("/search")
    public Object getProduct(
            @RequestParam String searchValue,
            @RequestParam(required = false, defaultValue = "false") Boolean addProductInformation,
            @RequestParam(required = false, defaultValue = "10") Integer number
    ) {
        if (Objects.nonNull(productRepository.findBySearchValue(searchValue))) {
            return productRepository.findBySearchValue(searchValue).getJson();
        } else {
            SpoonacularProduct spoonacularProduct = spoonacularDTO.getProductBySearchValue(searchValue, addProductInformation, number);
            productService.saveProductData(searchValue, spoonacularProduct);
            return spoonacularProduct;
        }
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
