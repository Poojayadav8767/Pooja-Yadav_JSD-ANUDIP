package com.EcoOrder.Ecohub.serviceimpl;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EcoOrder.Ecohub.entity.ShoppingCart;
import com.EcoOrder.Ecohub.repository.ShoppingCartRepository;
import com.EcoOrder.Ecohub.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
	
@Autowired
     ShoppingCartRepository shoppingCartRepository;

@Override
public List <ShoppingCart> fetchShoppingCart1(int cartId) {
	// TODO Auto-generated method stub
	return  shoppingCartRepository.findByShoppingCart(cartId);
	
}
}






	