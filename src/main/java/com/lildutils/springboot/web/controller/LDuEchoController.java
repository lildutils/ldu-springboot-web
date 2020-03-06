package com.lildutils.springboot.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lildutils.springboot.web.service.dto.LDuEchoDTO;

@RestController
public class LDuEchoController
{
	@GetMapping("/echo")
	@ResponseBody
	LDuEchoDTO get( HttpServletRequest request, Authentication authentication,
			@RequestParam Map<String, String> params )
	{
		return new LDuEchoDTO( request, authentication, params );
	}

}
