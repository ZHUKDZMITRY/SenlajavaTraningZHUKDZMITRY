package com.senla.service;

import com.senla.dao.AvtoMasterDAO;
import com.senla.model.AvtoMaster;

public class AvtoMasterService extends BaseService<AvtoMaster, AvtoMasterDAO> {

	@Override
	protected AvtoMasterDAO getDaoInstance() {
		return AvtoMasterDAO.getInstance();
	}
	
}
