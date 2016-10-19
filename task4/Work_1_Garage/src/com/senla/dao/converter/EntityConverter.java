package com.senla.dao.converter;

import com.senla.model.BaseEntity;

public interface EntityConverter<T extends BaseEntity> {
	
	String convertToString(T entity);

	T convertToEntity(String record);
}
