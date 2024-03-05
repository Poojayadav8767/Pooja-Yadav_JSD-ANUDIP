package com.EcoOrder.Ecohub.service;



import java.util.List;

import com.EcoOrder.Ecohub.entity.ShoppingCart;

public interface ShoppingCartService {
    
    // fetch cart details list from db as per id
    List <ShoppingCart> fetchShoppingCart1(int cartId);

}