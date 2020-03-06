package com.lildutils.springboot.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lildutils.springboot.web.service.dto.LDuStatusDTO;

@RestController
public class LDuStatusController
{
	@GetMapping("/status")
	@ResponseBody
	LDuStatusDTO getStatus()
	{
		return new LDuStatusDTO();
	}

}
