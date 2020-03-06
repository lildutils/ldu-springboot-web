package com.lildutils.springboot.web.service.helper;

public interface LDuServiceHelper<TDTO, TMODEL>
{
	TDTO convertModel( TMODEL model );

	TMODEL convertDTO( TDTO dto );

}
