package com.ciq.ems.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.ems.dao.PersonDaoImpl;
import com.ciq.ems.model.Person;

public class PersonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setId(1L);
		person.setFirstName("Rohit");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		PersonDaoImpl impl = context.getBean(PersonDaoImpl.class);
//		impl.save(person);
//		Person byId = impl.getById(1l);
//		System.out.println(byId);
//		impl.update(person);

//		Person byName = impl.getByName("Rohit");
//		System.out.println(byName);
	}

}
