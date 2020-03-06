package com.lildutils.springboot.web.configurer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.lildutils.springboot.web.security.LDuControllerEndpointSecurityRegister;

@Configuration
@ComponentScan(basePackageClasses = LDuControllerEndpointSecurityRegister.class)
public class LDuWebSecurityConfigurer
{

}
