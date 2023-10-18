package com.training.adi;

import java.util.Objects;

public class Contact {
	private String name;
	private String number;
	private String email;
	public Contact(String name, String number, String email) {
		this.name = name;
		this.number = number;
		this.email = email;
	}
	
	
	
	
	
	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getNumber() {
		return number;
	}





	public void setNumber(String number) {
		this.number = number;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	@Override
	public int hashCode() {
		return Objects.hash(number);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(number, other.number);
	}



	@Override
	public String toString(){
		return "Name: " + this.name + " Phone Number: " + this.number +  " Email Id: " + this.email;
		
	}
	
	
	
	
}
