package com.senla.service;

import java.util.List;

import com.senla.dao.OrderDAO;
import com.senla.model.Order;

public class OrderService {
	
	public Order create(Order order) {
		return OrderDAO.getInstance().create(order);
	}
	
	public List<Order> findAll() {
		return OrderDAO.getInstance().findAll();
	}

}
