package com.lildutils.springboot.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.lildutils.springboot.web.controller.LDuEchoController;
import com.lildutils.springboot.web.controller.LDuStatusController;
import com.lildutils.springboot.web.controller.LDuVersionController;
import com.lildutils.springboot.web.controller.advice.LDuControllerAdvice;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses =
{ LDuControllerAdvice.class, LDuEchoController.class, LDuStatusController.class, LDuVersionController.class })
public class LDuWebMvcConfigurer
{

}
