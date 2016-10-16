package com.senla.dao;

import java.util.ArrayList;
import java.util.List;

import com.danco.training.TextFileWorker;
import com.senla.model.BaseEntity;

public abstract class BaseDAO<T extends BaseEntity> {

	private Long lastId = 1L;
	
	TextFileWorker textFileWorker;
	
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
		entity.setId(getNextId());
		data.add(entity);
		saveData(data);
		return entity;
	}

	public void update(T updatedData) {
		List<T> data = getData();
		for (int i = 0; i < data.size(); i++) {
			if (data.get(i).equals(updatedData)) {
				data.set(i, updatedData);
				break;
			};
		}
		saveData(data);
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
				values[i] = convertToString(entities.get(i));
			}
		}
		textFileWorker.writeToFile(values);
	}
	
	protected List<T> getData() {
		List<T> result = new ArrayList<>();
		String[] values = textFileWorker.readFromFile();
		if (values != null) {
			for (String value : values) {
				result.add(convertToEntity(value));
			}
		}
		return result;
	}

	protected Long getNextId() {
		lastId = lastId == 1000000 ? 1L : lastId + 1;
		return lastId;
	}
	
	protected abstract String convertToString(T entity);

	protected abstract T convertToEntity(String record);

	protected abstract String getFileName();

}
