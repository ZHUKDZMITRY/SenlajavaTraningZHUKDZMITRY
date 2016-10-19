package com.senla.dao;

import com.senla.dao.converter.WorkPlaceConverter;
import com.senla.model.WorkPlace;

public class WorkPlaceDAO extends BaseDAO<WorkPlace, WorkPlaceConverter> {

	private static WorkPlaceDAO instance;
	
	private WorkPlaceDAO() {
		super();
	}
	
	public static WorkPlaceDAO getInstance() {
		if (instance == null) {
			instance = new WorkPlaceDAO();
		}
		return instance;
	}

	@Override
	protected String getFileName() {
		return "data/work_place.csv";
	}

	@Override
	protected WorkPlaceConverter createConverter() {
		return new WorkPlaceConverter();
	}
	
}
