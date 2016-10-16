package com.senla.dao;

import com.senla.model.WorkPlace;

public class WorkPlaceDAO extends BaseDAO<WorkPlace> {

	private static WorkPlaceDAO instance;
	
	private WorkPlaceDAO() {
		super();
	}

	@Override
	protected String convertToString(WorkPlace entity) {
		StringBuilder builder = new StringBuilder();
		builder.append(entity.getId());
		builder.append(";");
		builder.append(entity.getName());
		builder.append(";");
		builder.append(entity.getAvtoMaster() != null ? entity.getAvtoMaster().getId() : "");
		return builder.toString();
	}

	@Override
	protected WorkPlace convertToEntity(String record) {
		String[] values = record.split(";");
		WorkPlace result = new WorkPlace();
		result.setId(Long.valueOf(values[0]));
		result.setName(values[1]);
		result.setAvtoMaster(values[2].isEmpty() ? null : AvtoMasterDAO.getInstance().get(Long.valueOf(values[2])));
		return result;
	}

	@Override
	protected String getFileName() {
		return "data/work_place.csv";
	}

	public static WorkPlaceDAO getInstance() {
		if (instance == null) {
			instance = new WorkPlaceDAO();
		}
		return instance;
	}
	
}
