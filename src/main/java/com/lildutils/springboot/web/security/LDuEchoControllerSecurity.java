package com.lildutils.springboot.web.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

@Configuration
public class LDuEchoControllerSecurity extends LDuControllerEndpointSecurityRegister
{
	@Override
	protected void registerEndpointsWebSecurity() throws Exception
	{
		http.authorizeRequests().antMatchers( HttpMethod.GET, "/echo" ).permitAll()
				.antMatchers( HttpMethod.GET, "/echo.json" ).permitAll().antMatchers( HttpMethod.GET, "/echo.xml" )
				.permitAll();
	}

}
