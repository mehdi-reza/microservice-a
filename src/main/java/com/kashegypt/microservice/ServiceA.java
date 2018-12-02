package com.kashegypt.microservice;

import org.microprofile.microservice.MicroService;
import org.microprofile.microservice.annotations.ServiceDescriptor;
import org.microprofile.microservice.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ServiceDescriptor(name="microservice-a", url="http://blah-blah.com")
public class ServiceA implements MicroService {

	private Logger logger=LoggerFactory.getLogger(ServiceA.class);

	public Object service(RequestContext context) {
		
		logger.info("Servicing.. {}", context.getPayload());
		
		context.next("microservice-b");

		return new ServiceResponse(true);
	}

	public Class<ServiceRequest> getRequestType() {
		return ServiceRequest.class;
	}
}
