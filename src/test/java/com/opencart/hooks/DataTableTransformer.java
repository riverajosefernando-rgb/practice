package com.opencart.hooks;

import com.opencart.models.Product;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableTransformer {

    @DataTableType
    public Product productEntry(Map<String, String> entry) {

        Product product = new Product();
        product.setName(entry.get("name"));

        return product;
    }
}