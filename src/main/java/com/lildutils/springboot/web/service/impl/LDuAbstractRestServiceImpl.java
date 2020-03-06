package com.lildutils.springboot.web.service.impl;

import java.io.Serializable;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.lildutils.springboot.web.repository.LDuRestRepository;
import com.lildutils.springboot.web.service.LDuRestService;
import com.lildutils.springboot.web.service.dto.LDuListDTO;
import com.lildutils.springboot.web.service.helper.LDuServiceHelper;

public abstract class LDuAbstractRestServiceImpl<TDTO, TMODEL, TID extends Serializable> implements LDuRestService<TDTO>
{
	protected abstract LDuRestRepository<TMODEL, TID> getRepository();

	protected abstract LDuServiceHelper<TDTO, TMODEL> getHelper();

	protected TDTO doConvert( TMODEL model )
	{
		return getHelper().convertModel( model );
	}

	@Override
	public LDuListDTO<TDTO> list()
	{
		return doList();
	}

	protected LDuListDTO<TDTO> doList()
	{
		return new LDuListDTO<>( StreamSupport.stream( getRepository().findAll().spliterator(), false )
				.map( this::doConvert ).collect( Collectors.toList() ) );
	}

	@Override
	public long count()
	{
		return doCount();
	}

	protected long doCount()
	{
		return getRepository().count();
	}

}
