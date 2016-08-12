package com.randomjs.GenericDAOExample.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class GenericDAO implements IGenericDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional    
	public <T> T create(T entity) {
		sessionFactory.getCurrentSession().save(entity);
		return entity;
		
	}

}
