package com.cybage.spring.service;

import java.util.List;

import com.cybage.spring.entity.Todo;

public interface TodoService {
	List<Todo> getAllTodos();
	void save(Todo todo);
	void update(Todo todo);
	void delete(Todo todo);
}
