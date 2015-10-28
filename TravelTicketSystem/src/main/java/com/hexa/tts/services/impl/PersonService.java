/**
 * 
 */
package com.hexa.tts.services.impl;

import java.util.List;

import javax.ejb.EJB;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.hexa.tts.dao.ICrudOperations;
import com.hexa.tts.dao.IPersonDao;
import com.hexa.tts.entities.Employee;
import com.hexa.tts.entities.Person;
import com.hexa.tts.services.IPersonService;

/**
 * 
 * @author fruaku
 * @date 11.10.2014 00:04:38
 */
@Service
public class PersonService implements IPersonService
{
	@EJB
	private IPersonDao personDao; // TODO change call
	
	/**
	 * 
	 * @param person
	 */
	public void addPerson(Person person)
	{
		personDao.saveOrUpdate(person);
	}
}