package com.EcoOrder.Ecohub.service;

import java.util.List;


import com.EcoOrder.Ecohub.entity.Product;

public interface ProductService {
	// Register a new product in the database
    Product registerProduct(Product product);

    // Remove an existing product record based on id from the database
    void removeProduct(int productId);

    // Fetch product details based on id from the database
    Product fetchProductDetail(int productId);

    // Get a list of all products in the database
    List<Product> getAllProducts();

    // Other methods specific to product service
    // ...
}


