package com.kashegypt.microservice;

import org.microprofile.microservice.data.ResponseData;

public class ServiceResponse extends ResponseData {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6264268061050477667L;
	/**
	 * 
	 */
	private boolean success;

	public ServiceResponse(boolean success) {
		this.success=success;
	}
	
	public boolean isSuccess() {
		return success;
	}
}
