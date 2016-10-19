package com.senla.dao;

import java.util.ArrayList;
import java.util.List;

import com.danco.training.TextFileWorker;
import com.senla.dao.converter.EntityConverter;
import com.senla.model.BaseEntity;

public abstract class BaseDAO<T extends BaseEntity, C extends EntityConverter<T>> {

	private Long lastId = 1L;
	
	TextFileWorker textFileWorker;
	
	private C converter;
	
	public BaseDAO() {
		textFileWorker = new TextFileWorker(getFileName());
	}

	public void delete(T entity) {
		List<T> data = getData();
		data.remove(entity);
		saveData(data);
	};

	public T create(T entity) {
		List<T> data = getData();
		entity.setId(getNextId(data));
		data.add(entity);
		saveData(data);
		return entity;
	}

	public void save(T updatedData) {
		List<T> data = getData();
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).equals(updatedData)) {
				data.set(i, updatedData);
				break;
			};
		}
		saveData(data);
	}
	
	public void clear() {
		saveData(null);
	}

	public T get(Long id) {
		List<T> data = getData();
		T result = null;
		for (T entity : data) {
			if (entity.getId().equals(id)) {
				result = entity;
				break;
			}
		}
		return result;
	}
 	
	public List<T> findAll() {
		return getData();
	}

	protected void saveData(List<T> entities) {
		String[] values;
		if (entities == null) {
			values = new String[0];
		} else {
			values = new String[entities.size()];
			for (int i = 0; i < entities.size(); i++) {
				values[i] = getConverter().convertToString(entities.get(i));
			}
		}
		textFileWorker.writeToFile(values);
	}
	
	protected List<T> getData() {
		List<T> result = new ArrayList<>();
		String[] values = textFileWorker.readFromFile();
		if (values != null) {
			for (String value : values) {
				result.add(getConverter().convertToEntity(value));
			}
		}
		return result;
	}

	private Long getNextId(List<T> data) {
		lastId = 0L;
		for (T entity : data) {
			if (lastId < entity.getId()) {
				lastId = entity.getId();
			}
		}
		lastId = lastId >= 1000000 ? 1L : lastId + 1;
		return lastId;
	}
	
	protected C getConverter() {
		if (converter == null) {
			converter = createConverter();
		}
		return converter;
	}
	
	protected abstract C createConverter();

	protected abstract String getFileName();

}
