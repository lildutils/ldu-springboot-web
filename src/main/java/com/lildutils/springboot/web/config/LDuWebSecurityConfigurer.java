package com.lildutils.springboot.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.lildutils.springboot.web.security.LDuControllerWebSecurityConfigurer;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, proxyTargetClass = true)
@ComponentScan(basePackageClasses = LDuControllerWebSecurityConfigurer.class)
public class LDuWebSecurityConfigurer
{

}
