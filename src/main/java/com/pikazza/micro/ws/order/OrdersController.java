package com.pikazza.micro.ws.order;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;




@Path("/v1.0")
@Controller
public class OrdersController {
	
	private Logger logger = Logger
			.getLogger(this.getClass().getName());
	
	@Autowired
	private OrdersService ordersService;
	
	@GET
	@Path("/orders")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	//@RequestMapping("/users")
	public List<Orders> all() {
		logger.info("accounts-microservice all() invoked");
		List<Orders> users = ordersService.getAllOrders();
		logger.info("accounts-microservice all() found: " + users.size());
		return users;
	}
	
	@GET
	@Path("/orders/{id}")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	//@RequestMapping("/users/{id}")
	public Orders byId(@PathParam("id") String id) {
		logger.info("accounts-microservice byId() invoked: " + id);
		Orders user = ordersService.getOrder(id);
		logger.info("accounts-microservice byId() found: " + user);
		return user;
	}
	
	@GET
	@Path("/orderByCustomerId/{id}")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	//@RequestMapping("/users/{id}")
	public List<Orders> byCustomerId(@PathParam("id") String id) {
		logger.info("accounts-microservice byId() invoked: " + id);
		List<Orders> ordersList = ordersService.byCustomerId(id);
		return ordersList;
	}
	
	@POST
	@Path("/orders")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	//@RequestMapping("/users/{id}")
	public Orders postUser( Orders orders) {
		logger.info("adding new user ");
		Orders order = ordersService.postOrder(orders);
		logger.info("adding new user completed ");
		return order;
	}
	
	@PUT
	@Path("/orders")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	//@RequestMapping("/users/{id}")
	public Orders putUser( Orders orders) {
		logger.info("updating new user ");
		Orders order = ordersService.putOrder(orders);
		logger.info("updating new user completed ");
		return order;
	}
}
