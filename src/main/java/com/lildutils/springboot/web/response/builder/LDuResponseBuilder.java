package com.lildutils.springboot.web.response.builder;

import java.util.Arrays;

public class LDuResponseBuilder
{
	public static LDuResponseDTO build( String responseLevel, String... responseMessages )
	{
		final LDuResponseDTO dto = new LDuResponseDTO();
		dto.setLevel( responseLevel );
		Arrays.asList( responseMessages ).forEach( dto::add );
		return dto;
	}

	public static LDuResponseDTO build( LDuResponseLevel level, String... messages )
	{
		return build( level.name().toLowerCase(), messages );
	}

	public static LDuResponseDTO buildINFO( String message )
	{
		return build( LDuResponseLevel.INFO, message );
	}

	public static LDuResponseDTO buildINFO( String... messages )
	{
		return build( LDuResponseLevel.INFO, messages );
	}

	public static LDuResponseDTO buildWARN( String message )
	{
		return build( LDuResponseLevel.WARN, message );
	}

	public static LDuResponseDTO buildWARN( String... messages )
	{
		return build( LDuResponseLevel.WARN, messages );
	}

	public static LDuResponseDTO buildERROR( String message )
	{
		return build( LDuResponseLevel.ERROR, message );
	}

	public static LDuResponseDTO buildERROR( String... messages )
	{
		return build( LDuResponseLevel.ERROR, messages );
	}

}
