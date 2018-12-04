package com.kashegypt.microservice;

import javax.inject.Inject;
import javax.json.bind.Jsonb;

import org.microprofile.microservice.MicroService;
import org.microprofile.microservice.annotations.ServiceDescriptor;
import org.microprofile.microservice.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ServiceDescriptor(name="microservice-a", url="http://blah-blah.com")
public class ServiceA implements MicroService<ServiceRequest, ServiceResponse> {

	private Logger logger=LoggerFactory.getLogger(ServiceA.class);

	@Inject
	Jsonb jsonb;
	
	public ServiceResponse service(RequestContext context) {
		
		ServiceRequest request=(ServiceRequest) context.getPayload();  //jsonb.fromJson(context.getPayload().toString(), ServiceRequest.class);
		logger.info("Servicing.. id: {}, eventName: {}, amount: {}", request.getId(), request.getEventName(), request.getAmount());
		
		context.next("microservice-b");

		return new ServiceResponse(true);
	}

	public Class<ServiceRequest> getRequestType() {
		return ServiceRequest.class;
	}

	public Class<ServiceResponse> getResponseType() {
		return ServiceResponse.class;
	}
}
