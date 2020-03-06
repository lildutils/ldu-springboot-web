package com.lildutils.springboot.web.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

@Configuration
public class LDuActuatorControllerSecurity extends LDuControllerEndpointSecurityRegister
{
	@Override
	protected void registerEndpointsWebSecurity() throws Exception
	{
		http.authorizeRequests().antMatchers( HttpMethod.GET, "/actuator" ).permitAll()
				.antMatchers( HttpMethod.GET, "/actuator/**/*" ).permitAll();
	}

}
