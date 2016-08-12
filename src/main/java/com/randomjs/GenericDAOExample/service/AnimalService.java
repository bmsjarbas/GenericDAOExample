package com.randomjs.GenericDAOExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.randomjs.GenericDAOExample.dao.IGenericDAO;

@Component
public class AnimalService implements IAnimalService{

	@Autowired
	private IGenericDAO dao;
	public <T> T create(T animal) {
		return dao.create(animal);
	}

}
