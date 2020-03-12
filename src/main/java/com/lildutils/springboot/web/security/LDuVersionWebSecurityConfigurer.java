package com.lildutils.springboot.web.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class LDuVersionWebSecurityConfigurer implements LDuControllerWebSecurityConfigurer
{
	@Override
	public void configure( HttpSecurity http ) throws Exception
	{
		http.authorizeRequests().antMatchers( HttpMethod.GET, "/version" ).permitAll()
				.antMatchers( HttpMethod.GET, "/version.json" ).permitAll()
				.antMatchers( HttpMethod.GET, "/version.xml" ).permitAll();
	}

}
