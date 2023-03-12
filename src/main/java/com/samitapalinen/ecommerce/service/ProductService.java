package com.samitapalinen.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.samitapalinen.ecommerce.model.Product;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public String addProduct(Product product) {
        try {
            products.add(product);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "Product added";
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductBySku(String sku) {
        for (Product product : products) {
            if (product.getSku().equalsIgnoreCase(sku)) {
                return product;
            }
        }
        return null;
    }

    public String updateProduct(String sku, Product updatedProduct)
    {
        int productListSize = products.size();
        for (int i = 0; i < productListSize; i++) {
            if (products.get(i).getSku().equalsIgnoreCase(sku)) {
                updatedProduct.setSku(sku);
                products.set(i, updatedProduct);
                return "Product updated";
            }
        }
        return "No product found";
    }

    public String deleteProduct(String sku) {
        int productListSize = products.size();
        for (int i = 0; i < productListSize; i++) {
            if (products.get(i).getSku().equalsIgnoreCase(sku)) {
                products.remove(i);
                return "Product deleted";
            }
        }
        return "No product found";
    }
}
