package com.lildutils.springboot.web.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class LDuOptionsControllerSecurityRegister extends LDuControllerEndpointSecurityRegister
{
	@Override
	protected void registerEndpointsWebSecurity( HttpSecurity http ) throws Exception
	{
		http.authorizeRequests().antMatchers( HttpMethod.OPTIONS, "/**/*" ).permitAll();
	}

}
