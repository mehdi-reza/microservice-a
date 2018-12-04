package com.kashegypt.microservice;

import org.microprofile.microservice.data.RequestData;

public class ServiceRequest extends RequestData {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7908252573769338592L;
	/**
	 * 
	 */
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
