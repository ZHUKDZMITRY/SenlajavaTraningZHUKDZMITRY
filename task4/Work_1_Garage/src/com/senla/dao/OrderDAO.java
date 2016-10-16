package com.senla.dao;

import java.util.Date;

import com.senla.model.Order;
import com.senla.model.OrderStatus;

public class OrderDAO extends BaseDAO<Order> {
	
	private static OrderDAO instance;
	
	private OrderDAO() {
		super();
	}

	@Override
	protected String convertToString(Order entity) {
		StringBuilder builder = new StringBuilder();
		builder.append(entity.getId());
		builder.append(";");
		builder.append(entity.getName());
		builder.append(";");
		builder.append(entity.getCreatedDate().getTime());
		builder.append(";");
		builder.append(entity.getStartDate().getTime());
		builder.append(";");
		builder.append(entity.getStartDate().getTime());
		builder.append(";");
		builder.append(entity.getAvtoMaster() != null ? entity.getAvtoMaster().getId() : "");
		builder.append(";");
		builder.append(entity.getStatus().name());
		builder.append(";");
		builder.append(entity.getPrice());
		return builder.toString();
	}
	
	@Override
	protected Order convertToEntity(String record) {
		String[] values = record.split(";");
		Order result = new Order();
		result.setId(Long.valueOf(values[0]));
		result.setName(values[1]);
		result.setCreatedDate(new Date(Long.valueOf(values[2])));
		result.setStartDate(new Date(Long.valueOf(values[3])));
		result.setStartDate(new Date(Long.valueOf(values[4])));
		result.setAvtoMaster(values[5].isEmpty() ? null : AvtoMasterDAO.getInstance().get(Long.valueOf(values[5])));
		result.setStatus(OrderStatus.valueOf(values[6]));
		result.setPrice(values[7]);
		return result;
	}

	@Override
	protected String getFileName() {
		return "data/order.csv";
	}

	public static OrderDAO getInstance() {
		if (instance == null) {
			instance = new OrderDAO();
		}
		return instance;
	}

}
