package com.senla.dao;

import com.senla.dao.converter.AvtoMasterConverter;
import com.senla.model.AvtoMaster;

public class AvtoMasterDAO extends BaseDAO<AvtoMaster, AvtoMasterConverter> {
	
	private static AvtoMasterDAO instance;

	private AvtoMasterDAO() {
		super();
	}
	
	public static AvtoMasterDAO getInstance() {
		if (instance == null) {
			instance = new AvtoMasterDAO();
		}
		return instance;
	}

	@Override
	protected String getFileName() {
		return "data/avto_master.csv";
	}
	
	@Override
	protected AvtoMasterConverter createConverter() {
		return new AvtoMasterConverter();
	}
}
