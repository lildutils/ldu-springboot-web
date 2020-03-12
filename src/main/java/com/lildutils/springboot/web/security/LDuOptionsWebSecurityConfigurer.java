package com.lildutils.springboot.web.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class LDuOptionsWebSecurityConfigurer implements LDuControllerWebSecurityConfigurer
{
	@Override
	public void configure( HttpSecurity http ) throws Exception
	{
		http.authorizeRequests().antMatchers( HttpMethod.OPTIONS, "**" ).permitAll();
	}

}
