package com.lildutils.springboot.web.service;

import com.lildutils.springboot.web.service.dto.LDuListDTO;

public interface LDuRestService<TDTO>
{
	LDuListDTO<TDTO> list();

	long count();

}
