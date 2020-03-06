package com.lildutils.springboot.web.service.dto;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.security.core.Authentication;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonAutoDetect
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement
public class LDuEchoDTO
{
	private String			requestMethod;
	private String			requestURI;
	private String			requestURL;
	private List<String>	requestHeaders;
	private List<String>	requestParams;
	private Object			pathVariable;
	private Boolean			authenticated;
	private Object			requestData;

	public LDuEchoDTO()
	{
		super();
	}

	public LDuEchoDTO( HttpServletRequest request, Authentication authentication, Map<String, String> params )
	{
		super();
		getEcho( request, authentication, params );
	}

	public LDuEchoDTO( HttpServletRequest request, Authentication authentication, Map<String, String> params,
			Object pathVariable )
	{
		this( request, authentication, params );
		this.pathVariable = pathVariable;
	}

	public LDuEchoDTO( HttpServletRequest request, Authentication authentication, Map<String, String> params,
			Object pathVariable, Object body )
	{
		this( request, authentication, params, pathVariable );
		this.requestData = body;
	}

	private void getEcho( HttpServletRequest request, Authentication authentication, Map<String, String> params )
	{
		this.requestMethod = request.getMethod();
		this.requestURI = request.getRequestURI();
		this.requestURL = request.getRequestURL().toString();
		this.requestHeaders = processRequestHeaders( request );
		this.requestParams = processRequestParams( params );
		this.authenticated = authentication != null;
	}

	private List<String> processRequestHeaders( HttpServletRequest request )
	{
		List<String> h = new ArrayList<>();
		Enumeration<String> it = request.getHeaderNames();
		while( it.hasMoreElements() )
		{
			String header = it.nextElement();
			h.add( header + ":" + request.getHeader( header ) );
		}
		return h;
	}

	private List<String> processRequestParams( Map<String, String> params )
	{
		List<String> p = new ArrayList<>();
		for( Entry<String, String> entry : params.entrySet() )
		{
			String paramName = entry.getKey();
			String paramValue = entry.getValue();
			p.add( paramName + ":" + paramValue );
		}
		return p;
	}

	public String getRequestMethod()
	{
		return requestMethod;
	}

	public void setRequestMethod( String requestMethod )
	{
		this.requestMethod = requestMethod;
	}

	public String getRequestURI()
	{
		return requestURI;
	}

	public void setRequestURI( String requestURI )
	{
		this.requestURI = requestURI;
	}

	public String getRequestURL()
	{
		return requestURL;
	}

	public void setRequestURL( String requestURL )
	{
		this.requestURL = requestURL;
	}

	public List<String> getRequestHeaders()
	{
		return requestHeaders;
	}

	public void setRequestHeaders( List<String> requestHeaders )
	{
		this.requestHeaders = requestHeaders;
	}

	public List<String> getRequestParams()
	{
		return requestParams;
	}

	public void setRequestParams( List<String> requestParams )
	{
		this.requestParams = requestParams;
	}

	public Object getPathVariable()
	{
		return pathVariable;
	}

	public void setPathVariable( Object pathVariable )
	{
		this.pathVariable = pathVariable;
	}

	public Boolean getAuthenticated()
	{
		return authenticated;
	}

	public void setAuthenticated( Boolean authenticated )
	{
		this.authenticated = authenticated;
	}

	public Object getRequestData()
	{
		return requestData;
	}

	public void setRequestData( Object requestData )
	{
		this.requestData = requestData;
	}

}
