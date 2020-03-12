package com.lildutils.springboot.web.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public interface LDuControllerWebSecurityConfigurer
{
	void configure( HttpSecurity http ) throws Exception;

}
