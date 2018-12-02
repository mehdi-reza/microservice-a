package com.kashegypt.microservice;

public class ServiceResponse {

	private boolean success;

	public ServiceResponse(boolean success) {
		this.success=success;
	}
	
	public boolean isSuccess() {
		return success;
	}
}
