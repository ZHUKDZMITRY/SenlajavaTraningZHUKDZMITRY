package com.senla.service;

import com.senla.dao.WorkPlaceDAO;
import com.senla.model.WorkPlace;

public class WorkPlaceService extends BaseService<WorkPlace, WorkPlaceDAO> {

	@Override
	protected WorkPlaceDAO getDaoInstance() {
		return WorkPlaceDAO.getInstance();
	}

}
