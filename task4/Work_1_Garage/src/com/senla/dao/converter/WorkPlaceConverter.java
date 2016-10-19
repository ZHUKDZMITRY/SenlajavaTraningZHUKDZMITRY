package com.senla.dao.converter;

import com.senla.dao.AvtoMasterDAO;
import com.senla.model.WorkPlace;

public class WorkPlaceConverter implements EntityConverter<WorkPlace> {
	
	public String convertToString(WorkPlace entity) {
		StringBuilder builder = new StringBuilder();
		builder.append(entity.getId());
		builder.append(";");
		builder.append(entity.getName());
		builder.append(";");
		builder.append(entity.getAvtoMaster() != null ? entity.getAvtoMaster().getId() : "");
		builder.append(";");
		return builder.toString();
	}

	public WorkPlace convertToEntity(String record) {
		String[] values = record.split(";");
		WorkPlace result = new WorkPlace();
		result.setId(Long.valueOf(values[0]));
		result.setName(values[1]);
		result.setAvtoMaster(values.length < 3 || values[2].isEmpty() ? null
				: AvtoMasterDAO.getInstance().get(Long.valueOf(values[2])));
		return result;
	}
}
