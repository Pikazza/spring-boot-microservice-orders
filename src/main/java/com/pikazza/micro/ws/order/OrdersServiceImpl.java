package com.pikazza.micro.ws.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService{
	
	@Autowired
	OrdersStubRepository usersStubRepository;

	@Autowired
	OrdersRepository ordersRepository;
	
	public List<Orders> getAllOrders() {
		 List<Orders> users = ordersRepository.findAll();
		return users;
	}

	public Orders getOrder(String id) {
		Orders user = ordersRepository.findOne(id);
		return user;
	}

	@Override
	public Orders postOrder(Orders orders) {
		Orders ors = ordersRepository.save(orders);
		return ors;
	}

	@Override
	public Orders putOrder(Orders orders) {
		Orders oo = ordersRepository.findOne(orders.getOrderId());
		oo.setItemName(orders.getItemName());
		oo.setItemImage(orders.getItemImage());
		oo.setItemPrice(orders.getItemPrice());
		oo.setItemQty(orders.getItemQty());
		Orders ors = ordersRepository.save(orders);
		return ors;
	}

	@Override
	public List<Orders> byCustomerId(String id) {
		List<Orders> oo = ordersRepository.findByUserId(id);
		return oo;
	}

	
}
