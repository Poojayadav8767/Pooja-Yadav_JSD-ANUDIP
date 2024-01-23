package com.ecobookingplatform.ebp.service;

import java.util.List;

import com.ecobookingplatform.ebp.entity.Product;

public interface ProductService {

	    // Create a new product in the database
	    Product addProduct(Product product);

	    // Retrieve all products from the database
	    List<Product> getAllProducts();

	    // Retrieve a product by its ID from the database
	    Product getProductById(Long productId);

	    // Update an existing product by its ID in the database
	    Product updateProduct(Long productId, Product updatedProduct);

	    // Delete a product by its ID from the database
	    void deleteProduct(Long productId);
	}



