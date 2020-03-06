package com.lildutils.springboot.web.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

@Configuration
public class LDuStatusControllerSecurity extends LDuControllerEndpointSecurityRegister
{
	@Override
	protected void registerEndpointsWebSecurity() throws Exception
	{
		http.authorizeRequests().antMatchers( HttpMethod.GET, "/status" ).permitAll()
				.antMatchers( HttpMethod.GET, "/status.json" ).permitAll().antMatchers( HttpMethod.GET, "/status.xml" )
				.permitAll();
	}

}
