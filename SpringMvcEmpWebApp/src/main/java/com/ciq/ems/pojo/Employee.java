package com.ciq.ems.pojo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {

//	@NotEmpty
//	@NotNull

	private Integer id;
//	@NotEmpty(message = "Movie name cannot be empty.")
	@Size(min = 2, max = 30)
	@Pattern(regexp = "[^0-9]*")
	private String name;
	private Double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
