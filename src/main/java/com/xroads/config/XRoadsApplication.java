package com.xroads.config;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import com.xroads.filters.CORSResponseFilter;
import com.xroads.filters.LoggingResponseFilter;

/**
 * Registers the components to be used by the JAX-RS application  
 */
public class XRoadsApplication extends ResourceConfig {

    /**
	* Register JAX-RS application components.
	*/	
	public XRoadsApplication(){
		packages("com.xroads");
		register(RequestContextFilter.class);
		register(JacksonFeature.class);		
		register(LoggingResponseFilter.class);
		register(CORSResponseFilter.class);
	}
}
