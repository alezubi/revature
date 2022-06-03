package com.bank.Model;

//Employee properties start from here! All variables are declared inside of employee which is going to be used later!
//Constructor, setters and getters have been Auto-generated to avoid wasting time coding it (Can be edited if needed)
//toString has been Auto-Generated with the selected variables


public class Employee {
	private int employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employee_id, String first_name, String last_name, String email, String password) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
	}

	public int getEmployee_id() {
		return employee_id;
	} // It is never used but it has been Auto-Generated

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	} // It is never used but it has been Auto-Generated

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	} // It is never used but it has been Auto-Generated

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", password=" + password + "]";
	}
	
	
}
