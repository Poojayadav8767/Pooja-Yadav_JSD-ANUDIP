package com.EcoOrder.Ecohub.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.EcoOrder.Ecohub.entity.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer> {
	//custom query using jpql
		
		@Query(value="Select * from shopping_cart as shoppingCart where shoppingCart.cart_id=(:cartId)",nativeQuery=true)
		
		List<ShoppingCart> findByShoppingCart(int cartId);
}


