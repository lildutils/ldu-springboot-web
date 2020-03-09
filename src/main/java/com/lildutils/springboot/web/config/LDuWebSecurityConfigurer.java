package com.lildutils.springboot.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.lildutils.springboot.web.security.LDuControllerEndpointSecurityRegister;

@Configuration
@EnableWebSecurity
@ComponentScan(basePackageClasses = LDuControllerEndpointSecurityRegister.class)
public class LDuWebSecurityConfigurer
{

}
