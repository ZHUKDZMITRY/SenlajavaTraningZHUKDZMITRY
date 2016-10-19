package com.senla.model;

public class WorkPlace extends BaseEntity {

	private String name;	
	private AvtoMaster avtoMaster;
	
	public WorkPlace() {
	}
	
	public WorkPlace(String name) {
		this.name = name;
	}

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
	
	@Override
	public String toString() {
		return name;
	}
}
