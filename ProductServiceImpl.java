package com.ecobookingplatform.ebp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecobookingplatform.ebp.entity.Product;
import com.ecobookingplatform.ebp.repository.ProductRepository;
import com.ecobookingplatform.ebp.service.ProductService;

@Service
	public class ProductServiceImpl implements ProductService {

	    @Autowired
	    private ProductRepository productRepository;

	    @Override
	    public Product addProduct(Product product) {
	        // Implement logic to add a new product in the database
	        return productRepository.save(product);
	    }

	    @Override
	    public List<Product> getAllProducts() {
	        // Implement logic to retrieve all products from the database
	        return productRepository.findAll();
	    }

	    @Override
	    public Product getProductById(Long productId) {
	        // Implement logic to retrieve a product by its ID from the database
	        return productRepository.findById(productId).orElse(null);
	    }

	    @Override
	    public Product updateProduct(Long productId, Product updatedProduct) {
	        // Implement logic to update a product by its ID in the database
	        Product existingProduct = productRepository.findById(productId).orElse(null);

	        if (existingProduct != null) {
	            // Update the existing product with the new data
	            existingProduct.setProductName(updatedProduct.getProductName());
	            existingProduct.setPrice(updatedProduct.getPrice());

	            // Save the updated product
	            return productRepository.save(existingProduct);
	        } else {
	            // Product not found, return null or throw an exception based on your requirements
	            return null;
	        }
	    }

	    @Override
	    public void deleteProduct(Long productId) {
	        // Implement logic to delete a product by its ID from the database
	        productRepository.deleteById(productId);
	    }
	}



