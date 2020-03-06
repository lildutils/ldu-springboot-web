package com.lildutils.springboot.web.response.builder;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement
public class LDuResponseMessageDTO
{
	private String	key;
	private String	text;

	public LDuResponseMessageDTO()
	{
		super();
	}

	public LDuResponseMessageDTO( String key, String text )
	{
		super();
		this.key = key;
		this.text = text;
	}

	public LDuResponseMessageDTO( String key )
	{
		this( key, key );
	}

	public String getKey()
	{
		return key;
	}

	public void setKey( String key )
	{
		this.key = key;
	}

	public String getText()
	{
		return text;
	}

	public void setText( String text )
	{
		this.text = text;
	}

}
