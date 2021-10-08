package com.epsilong.designpatterns.prototypedesignpattern;

public class EmployeeRecord implements Prototype {

	private int id;
	private String name;
	private String designation;
	private double salary;
	private String address;
	
	
	public EmployeeRecord(int id, String name, String designation, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}
	
	public int getId() {
		return id;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void showRecord() {
		System.out.println(id+"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);
	}

	@Override
	public Prototype getClone() {
		
		return new EmployeeRecord(id, name, designation, salary, address);
	}

}
