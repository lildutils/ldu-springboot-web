package com.lildutils.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lildutils.springboot.web.service.dto.LDuVersionDTO;

@RestController
public class LDuVersionController
{
	@Autowired
	private Environment environment;

	@GetMapping("/version")
	@ResponseBody
	LDuVersionDTO getVersion()
	{
		return new LDuVersionDTO( environment );
	}

}
