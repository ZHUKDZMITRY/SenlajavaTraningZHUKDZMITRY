package com.senla.model;

import java.util.Date;

public class Order extends BaseEntity {

	private String name;
	private Date createdDate;
	private Date startDate;
	private Date endDate;
	private AvtoMaster avtoMaster;
	private OrderStatus status;
	private String price;
	
	public Order() {
		createdDate = new Date();
		status = OrderStatus.OPEN;
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

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%1$s | %2$s | %3$s | %4$s | %5$s | %6$s", status, createdDate, startDate, endDate, price,
				name);
	}
	
}
