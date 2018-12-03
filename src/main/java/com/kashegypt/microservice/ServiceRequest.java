package com.kashegypt.microservice;

import java.io.Serializable;

public class ServiceRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5199743347362947715L;
	private String eventName;
	private Double amount;
	private int id;

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
