package com.kashegypt.microservice;

import java.io.Serializable;

public class ServiceResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6284987689557509075L;
	private boolean success;

	public ServiceResponse(boolean success) {
		this.success=success;
	}
	
	public boolean isSuccess() {
		return success;
	}
}
