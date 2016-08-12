package com.randomjs.dao.interfaces;

public interface IGenericDAO {
	public <T> T create(T entity);
}
