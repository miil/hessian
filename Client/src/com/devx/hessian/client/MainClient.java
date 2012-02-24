package com.devx.hessian.client;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.dexv.hessian.IPersonService;
import com.dexv.hessian.Person;

@Component("mainClient")
public class MainClient {

	private IPersonService service = null;
	
	@Autowired
	public void setPersonService(@Qualifier("personService") IPersonService service) {
		this.service = service;
	}
	
	public void testService() {
		
		for(int i = 0; i < 10; i++) {
		
			//create
			Person person = new Person("John","Doe",Calendar.getInstance());
			person = service.add(person);
			System.out.println("Saved: Person.id = " + person.getId());
			System.out.println("Saved: Person.FirstName = " + person.getFirstName());
			
			//update
			person.setFirstName("Jane");
			service.update(person);
			System.out.println("Updated: Person.id = " + person.getId());
			System.out.println("Updated: Person.FirstName = " + person.getFirstName());
			
			//delete
			service.delete(person.getId());
			System.out.println("Deleted: Person.id = " + person.getId());
			
			//confirm delete
			person = service.get(person.getId());
			System.out.println("Person = " + person);
			
		}
		
	}
	
}
