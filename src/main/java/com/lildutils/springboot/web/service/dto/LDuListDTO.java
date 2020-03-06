package com.lildutils.springboot.web.service.dto;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement
public class LDuListDTO<TBODY>
{
	private Collection<TBODY> collection;

	public LDuListDTO()
	{
		super();
	}

	public LDuListDTO( Collection<TBODY> collection )
	{
		super();
		this.collection = collection;
	}

	public Collection<TBODY> getCollection()
	{
		return collection;
	}

	public void setCollection( Collection<TBODY> collection )
	{
		this.collection = collection;
	}

}
