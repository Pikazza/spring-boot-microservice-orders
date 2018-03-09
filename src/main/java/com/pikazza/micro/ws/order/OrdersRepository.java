package com.pikazza.micro.ws.order;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface OrdersRepository extends MongoRepository<Orders, String>  {

	List<Orders> findByUserId(String id);
	

}
