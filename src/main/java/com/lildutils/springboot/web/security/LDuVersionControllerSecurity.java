package com.lildutils.springboot.web.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

@Configuration
public class LDuVersionControllerSecurity extends LDuControllerEndpointSecurityRegister
{
	@Override
	protected void registerEndpointsWebSecurity() throws Exception
	{
		http.authorizeRequests().antMatchers( HttpMethod.GET, "/version" ).permitAll()
				.antMatchers( HttpMethod.GET, "/version.json" ).permitAll()
				.antMatchers( HttpMethod.GET, "/version.xml" ).permitAll();
	}

}
