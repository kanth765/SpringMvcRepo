package com.ciq.ems.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {

//	@Pattern(regexp = "^[0-9]*$", message = "please enter a number ")
	
//	@NotEmpty
	private int id;
//	@Pattern(regexp = "^[0-9]*$", message = "please enter a number ")
//	, message = "please enter a name between {min} to {max} characters"
	@Size(min = 2, max = 30)
//	@NotNull
	private String name;
	private double salary;
	
	@Size(min = 3, max = 10)
	private long bonous;
	// date and list
	//20250910
	@Past
	private Date joiningDate;
//	private List<Address> address;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

//	, List<Address> address
	 

	public int getId() {
		return id;
	}

	public Employee(int id, String name, double salary, long bonous, Date joiningDate) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.bonous = bonous;
	this.joiningDate = joiningDate;
}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", joiningDate=" + joiningDate + "]";
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public long getBonous() {
		return bonous;
	}

	public void setBonous(long bonous) {
		this.bonous = bonous;
	}

//	public String dateTOString() {
//		SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd");
//		return format.format(joiningDate);
//	}
	

}
