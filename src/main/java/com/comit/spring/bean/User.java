package com.comit.spring.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {

	String firstName;
	String lastName;
	String email;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	Date dob;

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

	public Date getDob() {
		return dob;
	}

	public void setDOb(Date dob) {
		this.dob = dob;
	}
	
    @Override
    public String toString() {
        return String.format("User [firstName=%s, lastName=%s, email=%s, dob=%s]", firstName, lastName, email, dob);
    }
}