package com.lildutils.springboot.web.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public abstract class LDuControllerEndpointSecurityRegister
{
	protected abstract void registerEndpointsWebSecurity( HttpSecurity http ) throws Exception;

	public void run( HttpSecurity http ) throws Exception
	{
		registerEndpointsWebSecurity( http );
	}

}
