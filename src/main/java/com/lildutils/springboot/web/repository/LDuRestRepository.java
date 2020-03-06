package com.lildutils.springboot.web.repository;

import org.springframework.data.repository.CrudRepository;

public interface LDuRestRepository<TMODEL, TID> extends CrudRepository<TMODEL, TID>
{

}
