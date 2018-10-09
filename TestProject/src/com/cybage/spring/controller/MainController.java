package com.cybage.spring.controller;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.spring.entity.Todo;
import com.cybage.spring.service.TodoService;
import com.google.gson.Gson;

@RestController
@RequestMapping("/MyTodo")
public class MainController {   

    
    @RequestMapping(path= "/getAllTodos",method=RequestMethod.GET, produces = "application/json; charset=UTF-8")    
    @ResponseBody
    public String getAllTodos() {    	
    	AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
		context.scan("com.cybage.spring.*"); 
		context.refresh();
		TodoService service = (TodoService) context.getBean("todoservice");        
        List<Todo> todos = service.getAllTodos();
        Gson gson = new Gson();
        String json = gson.toJson(todos);
        return json;       
    }
    
    @RequestMapping(path= "/saveTodo",method=RequestMethod.POST)    
    @ResponseBody
    public void save(@RequestBody String data) {    	
    	AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
		context.scan("com.cybage.spring.*"); 
		context.refresh();
		Gson gson = new Gson();
		Todo myTodo = gson.fromJson(data, Todo.class);
		TodoService service = (TodoService) context.getBean("todoservice");		
        service.save(myTodo);        
    }
    
    @RequestMapping(path= "/updateTodo/{id}",method=RequestMethod.PUT)    
    @ResponseBody
    public void update(@PathVariable String id,@RequestBody String data) {    	
    	AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
		context.scan("com.cybage.spring.*"); 
		context.refresh();
		Gson gson = new Gson();
		Todo myTodo = gson.fromJson(data, Todo.class);
		myTodo.setId(Integer.parseInt(id));
		TodoService service = (TodoService) context.getBean("todoservice");		
        service.update(myTodo);        
    }
    
    @RequestMapping(path= "/deleteTodo/{id}",method=RequestMethod.PUT)    
    @ResponseBody
    public void delete(@PathVariable String id,@RequestBody String data) {    	
    	AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
		context.scan("com.cybage.spring.*"); 
		context.refresh();
		Gson gson = new Gson();
		Todo myTodo = gson.fromJson(data, Todo.class);
		myTodo.setId(Integer.parseInt(id));
		TodoService service = (TodoService) context.getBean("todoservice");		
        service.delete(myTodo);        
    }
}