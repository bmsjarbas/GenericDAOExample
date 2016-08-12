package com.randomjs.GenericDAOExample.dao;

public interface IGenericDAO {
	public <T> T create(T entity);
}
