package com.cybage.spring.dao;

import java.util.List;

import com.cybage.spring.entity.Todo;


public interface TodoDAO {
	List<Todo> getAllTodos();
	void save(Todo todo);
	void update(Todo todo);
	void delete(Todo todo);
}
