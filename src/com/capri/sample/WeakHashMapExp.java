package com.capri.sample;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExp {

	public static void main(String[] args) {
		Map<Order,Integer> orders = new WeakHashMap<>();
		
		orders.put(new Order(1, "dfda"), 100);
		orders.put(new Order(2, "dfda"), 200);
		
		//Order o3 = new Order(3, "Asdagdge");
		//orders.put(o3, 1000);
		
		System.out.println(orders.size());
		
		System.gc();
		
		System.out.println(orders.size());
		

	}

}

class Order{
	int orderId;
	String details;
	
	public Order(int anId, String theDetails) {
		orderId = anId;
		details = theDetails;
	}
}