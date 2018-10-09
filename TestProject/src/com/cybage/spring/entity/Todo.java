package com.cybage.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todo")
public class Todo { 
	public Todo(int id, String taskname) {
		super();
		this.id = id;
		this.taskname = taskname;
	}
	public Todo() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="id")
    private int id;  
	@Column(name="taskname")
    private String taskname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((taskname == null) ? 0 : taskname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (id != other.id)
			return false;
		if (taskname == null) {
			if (other.taskname != null)
				return false;
		} else if (!taskname.equals(other.taskname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", taskname=" + taskname + "]";
	}
} 