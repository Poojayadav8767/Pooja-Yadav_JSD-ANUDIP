package com.ecobookingplatform.ebp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecobookingplatform.ebp.entity.Product;
import com.ecobookingplatform.ebp.service.ProductService;

import jakarta.validation.Valid;

@RestController
	@RequestMapping("/api/products")
	public class ProductController {

	    @Autowired
	    ProductService productService;

	    // Create a new product
	    @PostMapping("/add")
	    public ResponseEntity<Product> addProduct(@Valid @RequestBody Product product) {
	        Product savedProduct = productService.addProduct(product);
	        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
	    }

	    // Get all products
	    @GetMapping("/getAll")
	    public ResponseEntity<List<Product>> getAllProducts() {
	        List<Product> products = productService.getAllProducts();
	        return new ResponseEntity<>(products, HttpStatus.OK);
	    }

	    // Get a product by ID
	    @GetMapping("/get/{productId}")
	    public ResponseEntity<Product> getProductById(@PathVariable("productId") Long productId) {
	        Product product = productService.getProductById(productId);
	        return new ResponseEntity<>(product, HttpStatus.OK);
	    }

	    // Update a product by ID
	    @PutMapping("/update/{productId}")
	    public ResponseEntity<Product> updateProduct(@PathVariable("productId") Long productId,
	                                                 @Valid @RequestBody Product updatedProduct) {
	        Product product = productService.updateProduct(productId, updatedProduct);
	        return new ResponseEntity<>(product, HttpStatus.OK);
	    }

	    // Delete a product by ID
	    @DeleteMapping("/delete/{productId}")
	    public ResponseEntity<String> deleteProduct(@PathVariable("productId") Long productId) {
	        productService.deleteProduct(productId);
	        return new ResponseEntity<>("Deleted Product Record", HttpStatus.OK);
	    }
	}



