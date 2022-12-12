package com.simplediet.app.controller;

import com.simplediet.app.model.entity.spoonacularproduct.InformationProduct;
import com.simplediet.app.model.entity.spoonacularproduct.Product;
import com.simplediet.app.webclient.dto.client.SpooncularClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {
    private final SpooncularClient spooncularClient;

    /**
     * @param id gets a long value representing the product ID in the Spoonacular database
     * @return the InformationProduct object retrieved from the Spoonacular API
     */
    @GetMapping("/information/{id}")
    public InformationProduct getInformationProduct(@PathVariable long id) {
        return spooncularClient.getProductInformation(id);
    }

    /**
     * @param query accepts a String value in the form of a product name, e.g. pizza, yogurt, potato
     * @return basic information about the product and a list of the most popular products with their ID
     */
    @GetMapping("/search")
    public Product getProduct(@RequestParam String query,
                              @RequestParam(required = false, defaultValue = "false") Boolean addProductInformation,
                              @RequestParam(required = false, defaultValue = "10") Integer number) {
        return spooncularClient.getProduct(query, addProductInformation, number);
    }

    /**
     * @param upcCode retrieves a String representing the UPC product code
     * @return the InformationProduct object retrieved from the Spoonacular API
     */
    @GetMapping("/upc/{upcCode}")
    public InformationProduct getInformationProductWithUpcCode(@PathVariable String upcCode) {
        return spooncularClient.getProductInformationWithUpcCode(upcCode);
    }
}
