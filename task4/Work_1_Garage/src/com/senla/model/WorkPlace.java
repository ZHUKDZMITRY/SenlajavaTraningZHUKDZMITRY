package com.senla.model;

public class WorkPlace extends BaseEntity {

	private String name;	
	private AvtoMaster avtoMaster;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AvtoMaster getAvtoMaster() {
		return avtoMaster;
	}

	public void setAvtoMaster(AvtoMaster avtoMaster) {
		this.avtoMaster = avtoMaster;
	}
	
}
