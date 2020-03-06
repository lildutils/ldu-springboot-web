package com.lildutils.springboot.web.service.ex;

@SuppressWarnings("serial")
public class LDuServiceException extends RuntimeException
{
	public LDuServiceException()
	{
		super( "ERR_INTERNAL_SERVER_ERROR" );
	}

	public LDuServiceException( String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace )
	{
		super( message, cause, enableSuppression, writableStackTrace );
	}

	public LDuServiceException( String message, Throwable cause )
	{
		super( message, cause );
	}

	public LDuServiceException( String message )
	{
		super( message );
	}

	public LDuServiceException( Throwable cause )
	{
		super( cause );
	}

}
