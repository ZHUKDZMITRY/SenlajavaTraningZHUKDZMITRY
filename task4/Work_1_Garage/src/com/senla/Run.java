package com.senla;
import java.util.Date;
import java.util.List;

import com.senla.model.Order;
import com.senla.service.OrderService;

public class Run {

	public static void main(String[] args) {
		OrderService orderService = new OrderService();
		
		Order order = new Order();
		Date date = new Date();
		order.setStartDate(date);
		order.setEndDate(date);
		order.setName("Order 1");
		order.setPrice("30 USD");
		orderService.create(order);
		
		order = new Order();
		order.setStartDate(date);
		order.setEndDate(date);
		order.setName("Order 2");
		order.setPrice("70 USD");
		orderService.create(order);
		
		order = new Order();
		order.setStartDate(date);
		order.setEndDate(date);
		order.setName("Order 3");
		order.setPrice("100 USD");
		orderService.create(order);
		
		showLinyByLine("Orders:", orderService.findAll());
	}
	
	private static void showLinyByLine(String title, List<? extends Object> objects) {
		System.out.println(title);
		for (Object object : objects) {
			System.out.println(object);
		}
	}
}
