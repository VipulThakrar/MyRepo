package com.cybage.spring.poc;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cybage.spring.entity.Todo;
import com.cybage.spring.service.TodoService;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
		context.scan("com.cybage.spring.*"); 
		context.refresh();

		TodoService service = (TodoService) context.getBean("todoservice");
		
		/*
         * Get all todos list from database
         */
        List<Todo> todos = service.getAllTodos();
        for (Todo todo : todos) {
            System.out.println(todo);
        }
	}
}
