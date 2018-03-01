package com.pikazza.micro.ws.order;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Orders {

	long userId;
	long itemId;
	String itemName;
	String itemImage;
	String itemQty;
	String itemPrice;
	
	public Orders(long userId, long itemId, String itemName, String itemImage, String itemQty, String itemPrice) {
		super();
		this.userId = userId;
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemImage = itemImage;
		this.itemQty = itemQty;
		this.itemPrice = itemPrice;
	}
}
