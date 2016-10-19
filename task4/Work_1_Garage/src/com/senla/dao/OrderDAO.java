package com.senla.dao;

import com.senla.dao.converter.OrderConverter;
import com.senla.model.Order;

public class OrderDAO extends BaseDAO<Order, OrderConverter> {
	
	private static OrderDAO instance;
	
	private OrderDAO() {
		super();
	}
	
	public static OrderDAO getInstance() {
		if (instance == null) {
			instance = new OrderDAO();
		}
		return instance;
	}

	@Override
	protected String getFileName() {
		return "data/order.csv";
	}

	@Override
	protected OrderConverter createConverter() {
		return new OrderConverter();
	}
	
}
