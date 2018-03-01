package com.pikazza.micro.ws.order;

import java.util.List;

public interface OrdersService {

	List<Orders> getAllOrders();

	Orders getOrder(String id);

}
