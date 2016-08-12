package com.randomjs.dao.implementations;

import com.randomjs.dao.interfaces.IGenericDAO;

public class GenericDAO implements IGenericDAO {

	public <T> T create(T entity) {		
		return entity;
	}

}
