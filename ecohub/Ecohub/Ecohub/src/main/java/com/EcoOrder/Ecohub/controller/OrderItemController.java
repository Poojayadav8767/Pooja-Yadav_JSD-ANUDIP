package com.EcoOrder.Ecohub.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EcoOrder.Ecohub.entity.OrderItem;
import com.EcoOrder.Ecohub.service.OrderItemService;
import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class OrderItemController {
	@Autowired
     OrderItemService orderItemService;
	
	
	//post mapping to fetch all hotel 
	@PostMapping("/registerOrderItem")
	public ResponseEntity<OrderItem> saveCustomer(@Valid @RequestBody OrderItem orderItem){
		return new ResponseEntity<OrderItem>(orderItemService.registerOrderItem(orderItem),HttpStatus.CREATED);
	}
	
	
	//get mapping with parameter for item list as per orderitemid
	@GetMapping("/fetchOrderItem/{orderItemId}")
	public OrderItem fetchOderItem(@PathVariable("orderItemId") int orderItemId){
	//	return new ResponseEntity<OrderItem>(HttpStatus.OK);
		return orderItemService.fetchOrderItemDetail(orderItemId);
	}
}
	
    

	
	


