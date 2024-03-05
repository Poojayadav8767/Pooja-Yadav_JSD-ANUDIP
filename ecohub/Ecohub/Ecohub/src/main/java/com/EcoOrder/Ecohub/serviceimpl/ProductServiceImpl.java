package com.EcoOrder.Ecohub.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EcoOrder.Ecohub.entity.Product;
import com.EcoOrder.Ecohub.exception.ProductIdNotFoundException;
import com.EcoOrder.Ecohub.repository.ProductRepository;
import com.EcoOrder.Ecohub.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
     ProductRepository productRepository;

	@Override
	public Product registerProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
    }
	
	@Override
	public void removeProduct(int productId) {
		// TODO Auto-generated method stub
		Product productToDelete = fetchProductDetail(productId);
        productRepository.delete(productToDelete);
    }

	

	@Override
	public Product fetchProductDetail(int productId) {
		// TODO Auto-generated method stub
	 return productRepository.findById(productId).orElseThrow(() -> new ProductIdNotFoundException("Product not found with id: " + productId));
    }

	

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
	}
