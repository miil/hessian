package com.dexv.hessian;

import java.io.Serializable;
import java.util.Calendar;

public class Person implements Serializable {
	
	private Integer id;
	private String firstName;
	private String lastName;
	private Calendar birthDate;

	public Person() {
		super();
	}
	public Person(String firstName, String lastName, Calendar birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	
	/**
	 * @return Primary key
	 */
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Calendar getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}
}
