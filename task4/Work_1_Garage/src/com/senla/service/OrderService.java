package com.senla.service;

import com.senla.dao.OrderDAO;
import com.senla.model.Order;

public class OrderService extends BaseService<Order, OrderDAO> {

	@Override
	protected OrderDAO getDaoInstance() {
		return OrderDAO.getInstance();
	}
	
}