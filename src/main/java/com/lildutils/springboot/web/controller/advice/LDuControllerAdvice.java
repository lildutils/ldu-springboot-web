package com.lildutils.springboot.web.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.lildutils.springboot.web.response.builder.LDuResponseBuilder;
import com.lildutils.springboot.web.response.builder.LDuResponseDTO;
import com.lildutils.springboot.web.service.ex.LDuServiceException;

@ControllerAdvice
public class LDuControllerAdvice extends ResponseEntityExceptionHandler
{
	@ExceptionHandler(LDuServiceException.class)
	@ResponseBody
	ResponseEntity<?> handleLDuServiceException( LDuServiceException e )
	{
		final LDuResponseDTO body = LDuResponseBuilder.buildERROR( e.getMessage() );
		return super.handleExceptionInternal( e, body, null, HttpStatus.INTERNAL_SERVER_ERROR, null );
	}

}
