package com.senla.service;

import java.util.List;

import com.senla.dao.BaseDAO;
import com.senla.model.BaseEntity;

public abstract class BaseService<T extends BaseEntity, D extends BaseDAO<T, ?>> {

	public T create(T order) {
		return getDaoInstance().create(order);
	}
	
	public List<T> findAll() {
		return getDaoInstance().findAll();
	}
	
	public void delete(T entity) {
		getDaoInstance().delete(entity);
	}
	
	public void save(T entity) {
		getDaoInstance().save(entity);
	}

	public T get(Long id) {
		return getDaoInstance().get(id);
	}

	protected abstract D getDaoInstance();
}
