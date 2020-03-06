package com.lildutils.springboot.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public abstract class LDuControllerEndpointSecurityRegister
{
	@Autowired
	protected Environment	environment;

	@Autowired
	protected HttpSecurity	http;

	protected abstract void registerEndpointsWebSecurity() throws Exception;

	public LDuControllerEndpointSecurityRegister()
	{
		super();
		registerEndpoints();
	}

	private void registerEndpoints()
	{
		try
		{
			registerEndpointsWebSecurity();
		}
		catch( Exception e )
		{
			throw new ApplicationContextException( e.getMessage() );
		}
	}

}
