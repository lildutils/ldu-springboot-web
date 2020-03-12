package com.lildutils.springboot.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.lildutils.springboot.web.controller.LDuVersionController;
import com.lildutils.springboot.web.response.builder.LDuResponseBuilder;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = LDuVersionController.class)
public class LDuWebMvcConfigurer
{
	@Bean("lduResponseBuilder")
	public LDuResponseBuilder getLDuResponseBuilder()
	{
		return LDuResponseBuilder.init();
	}

}
