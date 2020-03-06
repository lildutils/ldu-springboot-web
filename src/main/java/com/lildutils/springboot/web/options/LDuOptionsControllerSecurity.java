package com.lildutils.springboot.web.options;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

import com.lildutils.springboot.web.security.LDuControllerEndpointSecurityRegister;

@Configuration
public class LDuOptionsControllerSecurity extends LDuControllerEndpointSecurityRegister
{
	@Override
	protected void registerEndpointsWebSecurity() throws Exception
	{
		http.authorizeRequests().antMatchers( HttpMethod.OPTIONS, "/v*/**" ).permitAll();
	}

}
