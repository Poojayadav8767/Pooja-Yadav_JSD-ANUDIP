package com.EcoOrder.Ecohub.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EcoOrder.Ecohub.entity.Product;
import com.EcoOrder.Ecohub.service.ProductService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ProductController {

    @Autowired
     ProductService productService;
    
    @PostMapping("/regsiterProduct")
	//valid - will check all validation of customer entity during runtime
	//requestbody - indicates method parameter should be bound to the body of the web request
	public ResponseEntity<Product> saveProduct(@Valid @RequestBody Product product){
		return new ResponseEntity<Product>(productService.registerProduct(product),HttpStatus.CREATED);
	}
    
    @DeleteMapping("/deleteProduct/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable("productId") int productId){
    	productService.removeProduct(productId);
		return new ResponseEntity<String>("Deleted product Record", HttpStatus.OK);
	}
    
  //using get mapping to fetch customer based in id with httpstatus OK & code 200
  		@GetMapping("/fetchProduct/{productId}")
  		//pathVariable - indicates that a method parameter should be bound to a URI template variable
  		public ResponseEntity<Product> fetchProduct(@PathVariable("productId") int productId){
  			return new ResponseEntity<Product>(productService.fetchProductDetail(productId), HttpStatus.OK);	
  		}
  		
  		@GetMapping("/fetchAllProducts")
  	    public ResponseEntity<List<Product>>getAllProducts() {
  	        return new ResponseEntity<List<Product>>(productService.getAllProducts(), HttpStatus.OK);
  	    }
  		
  
}
    
    
    
    
    
    
    
	   