package com.lildutils.springboot.web.configurer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.lildutils.springboot.web.controller.LDuEchoController;
import com.lildutils.springboot.web.controller.LDuStatusController;
import com.lildutils.springboot.web.controller.LDuVersionController;
import com.lildutils.springboot.web.controller.advice.LDuControllerAdvice;

@Configuration
@ComponentScan(basePackageClasses =
{ LDuControllerAdvice.class, LDuEchoController.class, LDuStatusController.class, LDuVersionController.class })
public class LDuWebMvcConfigurer
{

}
