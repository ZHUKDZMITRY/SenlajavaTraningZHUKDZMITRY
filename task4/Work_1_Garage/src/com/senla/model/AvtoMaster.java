package com.senla.model;

public class AvtoMaster extends BaseEntity {

	private String firstName;
	private String middleName;
	private String lastName;
	private WorkPlace workPlace;
	private Order currentOrder;
	
	public AvtoMaster() {
	}
	
	public AvtoMaster(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public WorkPlace getWorkPlace() {
		return workPlace;
	}

	public void setWorkPlace(WorkPlace workPlace) {
		this.workPlace = workPlace;
	}

	public Order getCurrentOrder() {
		return currentOrder;
	}

	public void setCurrentOrder(Order currentOrder) {
		this.currentOrder = currentOrder;
	}
	
	@Override
	public String toString() {
		return String.format("%1$s | %2$s | %3$s | %4$s ", firstName, middleName, lastName,
				currentOrder == null ? "free" : "busy");
	}

}
