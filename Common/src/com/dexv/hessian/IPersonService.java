package com.dexv.hessian;


public interface IPersonService {

	/**
	 * Gets a person by ID
	 * @param id ID
	 * @return
	 */
	Person get(Integer id);
	/**
	 * @param person Person
	 * @return Updated Person with generated ID
	 */
	Person add(Person person);
	/**
	 * Deletes person by Id
	 * @param personId
	 */
	void delete(Integer personId);
	
	/**
	 * Updates person
	 * @param person
	 */
	void update(Person person);
}
