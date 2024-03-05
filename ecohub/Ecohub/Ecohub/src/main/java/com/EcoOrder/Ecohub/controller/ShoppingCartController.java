package com.EcoOrder.Ecohub.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.EcoOrder.Ecohub.entity.ShoppingCart;
import com.EcoOrder.Ecohub.service.ShoppingCartService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;
    	
    	@GetMapping("/getShoppingCart/{cartId}")
    	public List <ShoppingCart> getShoppingCartBycartId(@PathVariable("cartId") int cartId){
    		return  shoppingCartService.fetchShoppingCart1(cartId);
    	}
}
    