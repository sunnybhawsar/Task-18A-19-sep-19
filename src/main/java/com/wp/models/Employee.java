package com.wp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int eno;
	private String name;
	private int salary;
	
	// Constructors
	
	public Employee(int eno, String name, int salary) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}
	public Employee(int eno) {
		super();
		this.eno = eno;
	}
	public Employee() {
		super();
	}
	
	// Getters and Setters
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	// ToString method
	
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
