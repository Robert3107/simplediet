package com.simplediet.app.controller;

import com.simplediet.app.model.entity.Product;
import com.simplediet.app.model.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
@Slf4j
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping("/list")
    public List<Product> productList() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable long id) {
        return productRepository.findById(id);
    }

    @PostMapping("/add")
    public HttpStatus addProduct(@RequestBody Product product) {
        try {
            productRepository.save(product);
            return HttpStatus.OK;
        } catch (Exception e) {
            e.printStackTrace();
            return HttpStatus.BAD_REQUEST;
        }
    }

    @PutMapping("/edit/{id}")
    public HttpStatus editProduct(@PathVariable long id, @RequestBody Product product) {
        try {
            productRepository.findById(id);
            productRepository.save(product);
            return HttpStatus.OK;
        } catch (IllegalArgumentException e) {
            return HttpStatus.NOT_FOUND;
        }
    }

    @DeleteMapping("/remove/{id}")
    public HttpStatus deleteProduct(@PathVariable long id) {
        try {
            productRepository.deleteById(id);
            return HttpStatus.OK;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return HttpStatus.NOT_FOUND;
        }
    }

}
