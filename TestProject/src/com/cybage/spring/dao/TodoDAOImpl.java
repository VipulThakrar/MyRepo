package com.cybage.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.cybage.spring.entity.Todo;

@Repository("todoDao")
public class TodoDAOImpl extends GenericDAO implements TodoDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Todo> getAllTodos() {
		// TODO Auto-generated method stub
		 Criteria criteria = getSession().createCriteria(Todo.class);
	     return (List<Todo>) criteria.list();
	}

	@Override
	public void save(Todo todo) {
		Session session = getSession();
		session.save(todo);		
	}

	@Override
	public void update(Todo todo) {
		// TODO Auto-generated method stub
		Session session = getSession();
		session.update(todo);	
	}

	@Override
	public void delete(Todo todo) {
		// TODO Auto-generated method stub
		Session session = getSession();
		session.delete(todo);	
	}

}
