package com.lildutils.springboot.web.response.builder;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement
public class LDuResponseDTO
{
	private String						level;

	private List<LDuResponseMessageDTO>	messages	= new ArrayList<>();

	public LDuResponseDTO()
	{
		super();
	}

	public void add( LDuResponseMessageDTO... messages )
	{
		for( int i = 0; i < messages.length; i++ )
		{
			getMessages().add( messages[i] );
		}
	}

	public String getLevel()
	{
		return level;
	}

	public void setLevel( String level )
	{
		this.level = level;
	}

	public List<LDuResponseMessageDTO> getMessages()
	{
		return messages;
	}

	public void setMessages( List<LDuResponseMessageDTO> messages )
	{
		this.messages = messages;
	}

}
