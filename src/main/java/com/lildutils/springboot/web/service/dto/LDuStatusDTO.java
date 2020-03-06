package com.lildutils.springboot.web.service.dto;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement
public class LDuStatusDTO
{
	private String status;

	private enum Status
	{
		UP_AND_RUNNING;
	}

	public LDuStatusDTO()
	{
		super();
		this.status = Status.UP_AND_RUNNING.name();
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus( String status )
	{
		this.status = status;
	}

}
