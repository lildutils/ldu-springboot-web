package com.lildutils.springboot.web.configurer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.lildutils.springboot.web.options.LDuOptionsControllerSecurity;

@Configuration
@ComponentScan(basePackageClasses = LDuOptionsControllerSecurity.class)
public class LDuWebOptionsConfigurer
{

}
