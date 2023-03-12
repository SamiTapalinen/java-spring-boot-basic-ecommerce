package com.samitapalinen.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.samitapalinen.ecommerce.model.Product;
import com.samitapalinen.ecommerce.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("products/{sku}")
    public Product getProductBySku(@PathVariable String sku) {
        return productService.getProductBySku(sku);
    }

    @PostMapping("product")
    public String addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @PutMapping("product/{sku}")
    public String updateProduct(@PathVariable String sku, @RequestBody Product product) {
        return productService.updateProduct(sku, product);
    }
}
