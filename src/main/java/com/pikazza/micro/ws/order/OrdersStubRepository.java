package com.pikazza.micro.ws.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 * @author Dinesh.Rajput
 *
 */
@Repository
public class OrdersStubRepository{
	
	private Map<String, Orders> ordersByNumber = new HashMap<String, Orders>();
	
	public OrdersStubRepository() {
		
		Orders user = new Orders(1l, 111l, "item1" , "image1", "2","40");
		ordersByNumber.put("1", user);
		user = new Orders(2l, 112l, "item2" , "image2", "2","40");
		ordersByNumber.put("2", user);
		
		user = new Orders(3l, 113l, "item3" , "image3", "2","40");
		ordersByNumber.put("3", user);
		user = new Orders(4l, 114l, "item4" , "image4", "2","40");
		ordersByNumber.put("4", user);
		Logger.getLogger(OrdersStubRepository.class).info("Created StubAccountRepository");
	}
	
	public List<Orders> getAllOrders() {
		return new ArrayList<Orders>(ordersByNumber.values());
	}


	public Orders getOrder(String number) {
		return ordersByNumber.get(number);
	}

}
