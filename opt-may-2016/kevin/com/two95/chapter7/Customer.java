package com.two95.chapter7;

public class Customer {
	String firstName;
	String lastName;
	int ssn;
	public Customer(String firstName,String lastName,int ssn){
		this.firstName=firstName;
		this.lastName=lastName;
		this.ssn=ssn;
	}
	public Customer(String firstName2, String lastName2, String string) {
		// TODO Auto-generated constructor stub
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public int getSsn(){
		return this.ssn;
	}

}
