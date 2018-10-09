package com.cybage.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.spring.dao.TodoDAO;
import com.cybage.spring.entity.Todo;

@Service("todoservice")
@Transactional
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoDAO dao;
	
	@Override
	public List<Todo> getAllTodos() {
		return dao.getAllTodos();		
	}

	@Override
	public void save(Todo todo) {
		// TODO Auto-generated method stub
		dao.save(todo);	
	}

	@Override
	public void update(Todo todo) {
		// TODO Auto-generated method stub
		dao.update(todo);	
	}

	@Override
	public void delete(Todo todo) {
		// TODO Auto-generated method stub
		dao.delete(todo);	
	}

}
