package com.cisc181.core;
public class PersonException extends Exception {
	private Person person;
	
	public PersonException(Person person, String errMessage) {
		super(errMessage);
		this.person = person;
	}
}
