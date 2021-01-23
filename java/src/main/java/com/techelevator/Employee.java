package com.techelevator;

public class Employee {
	
	private long employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private double salary;
	private Department department;
	private String hireDate;


	
	// Getters & Setters
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	
	// Constance
	static private final double STARTING_SALARY = 60000;
	
	
	//Kernsterktrs
	
	// This one is the pushover. It accepts all arguments. HEYOOOOOOOOO
	public Employee(long employeeId, String firstName, String lastName, String email, Department department, String hireDate) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.department = department;
		this.hireDate = hireDate;
		salary = STARTING_SALARY;
	}
	
	// This is the other one.
	public Employee() {
		employeeId = 1138;
		firstName = "Frank";
		lastName = "Fella";
		email = "frank@techelevator.com";
		hireDate = "12/25/2020";
		salary = STARTING_SALARY;		
	}
	
	public String getFullName() {
		return (getLastName() + ", " + getFirstName());
	}
	
	public double raiseSalary(double percent) {
		double decimaledPercent = (1 + (percent * .01));
		double raisedSalary = (salary * decimaledPercent);
		return raisedSalary;
	}

}
