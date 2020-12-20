package com.revature.services;

import com.revature.beans.Person;
import com.revature.data.PersonDAO;
import com.revature.data.PersonDAOFactory;

public class PersonServiceImpl implements PersonService {

	private PersonDAO personDao;
	
	public PersonServiceImpl() {
		PersonDAOFactory personDaoFactory = new PersonDAOFactory();
		personDao = personDaoFactory.getPersonDAO();
	}

	@Override
	public Integer addPerson(Person p) {
		return personDao.add(p).getId();
	}

	@Override
	public Person getPersonById(Integer id) {
		return personDao.getById(id);
	}

	@Override
	public Person updateUsername(Person p, String newUsername) {
		p.setUsername(newUsername);
		personDao.update(p);
		return personDao.getByUsername(newUsername);
	}
// add a comment
	@Override
	public void updatePerson(Person p) {
		personDao.update(p);
	}

	@Override
	public void deletePerson(Person p) {
		personDao.delete(p);
	}

}
