package com.epsilon.firstspringdemo;

public class Emplyee {
	
	public int employeeId;
	public String employeeName;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Emplyee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
	

}
