package com.lildutils.springboot.web.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public interface LDuSecurityRegister
{
	void run( HttpSecurity http ) throws Exception;

}
