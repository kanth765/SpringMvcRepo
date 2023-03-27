package com.ciq.ems.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ciq.ems.model.Person;

@Repository
@Transactional
public class PersonDaoImpl implements PersonDao {
//
//	@Autowired
//	private SessionFactory sessionFactory;

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void save(Person person) {
//		sessionFactory.getCurrentSession().save(person);
		hibernateTemplate.save(person);
	}

	@Override
	public List<Person> getPerson() {
//		Session session = sessionFactory.openSession();
//		List<Person> persons=session.createQuery("from Person").list();
		return hibernateTemplate.loadAll(Person.class);
	}

	@Override
	public void update(Person person) {
//		Session session = sessionFactory.openSession();
		Person p = getById(person.getId());
		p.setFirstName(person.getFirstName());
		hibernateTemplate.update(p);
	}

	@Override
	public Person getById(long id) {
		return hibernateTemplate.get(Person.class, id);
	}

	@Override
	public void delete(long id) {
		hibernateTemplate.delete(getById(id));
	}

//	@Override
//	public Person getByName(String name) {
//		hibernateTemplate.get("select id, name from Person where name=:name", name);
//		return hibernateTemplate.get(Person.class, name);
//	}

}
