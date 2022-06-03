package com.bank.Model;

//Customer properties start from here! All variables are declared inside of customer which is going to be used later!
//Constructor, setters and getters have been Auto-generated to avoid wasting time coding it (Can be edited if needed)
//toString has been Auto-Generated with the selected variables
//To String (For esthetic purposes it has been edited so the output is better)
//Constructor without customer_id to create new to record using serial auto increment for customer_id
//Which is already setted up in the database
public class Customer {
	private int customer_id;
	private String first_name;
	private String last_name;
	private String gender;
	private String address;
	private long phone;
	private String email;
	private String password;
	private String status;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int customer_id, String first_name, String last_name, String gender, String address, long phone,
			String email, String password, String status) {
		super();
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.status = status;
	}
	
	//Constructor without customer_id to create new to record using serial auto increment for customer_id
	public Customer(String first_name, String last_name, String gender, String address, long phone, String email,
			String password) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}

	public int getCustomer_id() {
		return customer_id;
	} // It is never used but it has been Auto-Generated

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getStatus() {
		return status;
	} //It is never used but it has been Auto-generated

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", gender=" + gender + ", address=" + address + ", phone=" + phone + ", email=" + email
				+ ", password=" + password + ", status=" + status + "]";
	}

	
}
