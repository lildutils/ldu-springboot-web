package com.lildutils.springboot.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class LDuWebSecurityRegister implements LDuSecurityRegister
{
	@Autowired
	private LDuActuatorControllerSecurityRegister	actuatorSecurityRegister;

	@Autowired
	private LDuEchoControllerSecurityRegister		echoSecurityRegister;

	@Autowired
	private LDuOptionsControllerSecurityRegister	optionsSecurityRegister;

	@Autowired
	private LDuStatusControllerSecurityRegister		statusSecurityRegister;

	@Autowired
	private LDuVersionControllerSecurityRegister	versionSecurityRegister;

	@Override
	public void run( HttpSecurity http ) throws Exception
	{
		actuatorSecurityRegister.run( http );
		echoSecurityRegister.run( http );
		optionsSecurityRegister.run( http );
		statusSecurityRegister.run( http );
		versionSecurityRegister.run( http );
	}

}
