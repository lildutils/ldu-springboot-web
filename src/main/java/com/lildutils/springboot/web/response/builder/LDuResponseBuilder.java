package com.lildutils.springboot.web.response.builder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LDuResponseBuilder
{
	private LDuResponseBuilder()
	{
		super();
	}

	public static LDuResponseBuilder init()
	{
		return new LDuResponseBuilder();
	}

	public LDuResponseDTO build( LDuResponseLevel responseLevel, List<LDuResponseMessageDTO> responseMessages )
	{
		final LDuResponseDTO dto = new LDuResponseDTO();
		dto.setLevel( responseLevel.name() );
		responseMessages.forEach( responseMessage -> dto.add( responseMessage ) );
		return dto;
	}

	public LDuResponseDTO buildINFO( String message )
	{
		return buildINFO( message, message );
	}

	public LDuResponseDTO buildINFO( String messageKey, String... messages )
	{
		return build( LDuResponseLevel.INFO, Arrays.asList( messages ).stream()
				.map( message -> new LDuResponseMessageDTO( messageKey, message ) ).collect( Collectors.toList() ) );
	}

	public LDuResponseDTO buildWARN( String message )
	{
		return buildWARN( message, message );
	}

	public LDuResponseDTO buildWARN( String messageKey, String... messages )
	{
		return build( LDuResponseLevel.WARN, Arrays.asList( messages ).stream()
				.map( message -> new LDuResponseMessageDTO( messageKey, message ) ).collect( Collectors.toList() ) );
	}

	public LDuResponseDTO buildERROR( String message )
	{
		return buildERROR( message, message );
	}

	public LDuResponseDTO buildERROR( String messageKey, String... messages )
	{
		return build( LDuResponseLevel.ERROR, Arrays.asList( messages ).stream()
				.map( message -> new LDuResponseMessageDTO( messageKey, message ) ).collect( Collectors.toList() ) );
	}

}
