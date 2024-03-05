package com.EcoOrder.Ecohub.service;





import com.EcoOrder.Ecohub.entity.OrderItem;

public interface OrderItemService {
	// Register a new order item in the database
    OrderItem registerOrderItem(OrderItem orderItem);

    

    // Fetch order item details based on id from the database
    OrderItem fetchOrderItemDetail(int orderItemId);

    // Other methods specific to order item service
    // ...
}


