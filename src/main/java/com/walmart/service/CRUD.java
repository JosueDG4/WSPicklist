package com.walmart.service;

import java.util.List;

public interface CRUD<T> {
	
	public T save(T t);
	public T update(T t);
	public void delete(int id);
	public T findById(int id);
	public List<T> list();

}
