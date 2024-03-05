package com.EcoOrder.Ecohub.serviceimpl;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EcoOrder.Ecohub.entity.OrderItem;
import com.EcoOrder.Ecohub.repository.OrderItemRepository;
import com.EcoOrder.Ecohub.service.OrderItemService;

@Service
public class OrderItemServiceImpl implements OrderItemService{
	@Autowired
     OrderItemRepository orderItemRepository;

	@Override
	public OrderItem registerOrderItem(OrderItem orderItem) {
		// TODO Auto-generated method stub
		return orderItemRepository.save(orderItem);
	}

	@Override
	public OrderItem fetchOrderItemDetail(int orderItemId) {
		// TODO Auto-generated method stub
		return  orderItemRepository.findById(orderItemId).get();
		
                
	}

}
