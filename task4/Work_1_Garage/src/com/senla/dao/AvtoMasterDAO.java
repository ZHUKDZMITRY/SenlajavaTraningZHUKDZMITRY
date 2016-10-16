package com.senla.dao;

import com.senla.model.AvtoMaster;

public class AvtoMasterDAO extends BaseDAO<AvtoMaster> {
	
	private static AvtoMasterDAO instance;

	private AvtoMasterDAO() {
		super();
	}

	@Override
	protected String convertToString(AvtoMaster entity) {
		StringBuilder builder = new StringBuilder();
		builder.append(entity.getId());
		builder.append(";");
		builder.append(entity.getFirstName());
		builder.append(";");
		builder.append(entity.getMiddleName());
		builder.append(";");
		builder.append(entity.getLastName());
		builder.append(";");
		builder.append(entity.getCurrentOrder() != null ? entity.getCurrentOrder().getId() : "");
		builder.append(";");
		builder.append(entity.getWorkPlace() != null ? entity.getWorkPlace().getId() : "");
		return builder.toString();
	}

	@Override
	protected AvtoMaster convertToEntity(String record) {
		String[] values = record.split(";");
		AvtoMaster result = new AvtoMaster();
		result.setId(Long.valueOf(values[0]));
		result.setFirstName(values[1]);
		result.setMiddleName(values[2]);
		result.setLastName(values[3]);
		result.setCurrentOrder(values[4].isEmpty() ? null: OrderDAO.getInstance().get(Long.valueOf(values[4])));
		result.setWorkPlace(values[5].isEmpty() ? null : WorkPlaceDAO.getInstance().get(Long.valueOf(values[5])));
		return result;
	}

	@Override
	protected String getFileName() {
		return "data/avto_master.csv";
	}

	public static AvtoMasterDAO getInstance() {
		if (instance == null) {
			instance = new AvtoMasterDAO();
		}
		return instance;
	}
}
