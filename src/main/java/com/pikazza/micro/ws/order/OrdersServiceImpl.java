package com.pikazza.micro.ws.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService{
	
	@Autowired
	OrdersStubRepository usersStubRepository;

	public List<Orders> getAllOrders() {
		 List<Orders> users = usersStubRepository.getAllOrders();
		return users;
	}

	public Orders getOrder(String id) {
		Orders user = usersStubRepository.getOrder(id);
		// TODO Auto-generated method stub
		return user;
	}

	
}
