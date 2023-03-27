package com.ciq.ems.dao;

import java.util.List;

import com.ciq.ems.model.Person;

public interface PersonDao {

	void save(Person person);

	void update(Person person);

	List<Person> getPerson();

	Person getById(long id);

	void delete(long id);

//	Person getByName(String name);

}
