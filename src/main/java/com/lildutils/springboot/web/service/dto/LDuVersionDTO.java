package com.lildutils.springboot.web.service.dto;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.core.env.Environment;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement
public class LDuVersionDTO
{
	private String	name;
	private String	version;

	public LDuVersionDTO()
	{
		super();
	}

	public LDuVersionDTO( Environment environment )
	{
		super();
		this.name = environment.getProperty( "application.name" );
		this.version = environment.getProperty( "application.version" );
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public String getVersion()
	{
		return version;
	}

	public void setVersion( String version )
	{
		this.version = version;
	}

}
