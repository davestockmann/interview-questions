package com.perficient.stl.interview.tests;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -3482331146231146564L;
	private String firstName;
	private String lastName;

	public String getFullName() {
		return firstName + " " + lastName;
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

}
