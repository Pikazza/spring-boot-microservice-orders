package com.pikazza.micro.ws.order;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Orders {

	@Id
	String orderId;
	String itemId;
	String userId;
	String itemName;
	String itemImage;
	String itemQty;
	String itemPrice;
	
	public Orders(String userId, String itemId, String itemName, String itemImage, String itemQty, String itemPrice) {
		super();
		this.userId = userId;
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemImage = itemImage;
		this.itemQty = itemQty;
		this.itemPrice = itemPrice;
	}
	
	public Orders(){
		
	}
}
