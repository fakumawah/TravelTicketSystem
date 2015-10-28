/**
 * 
 */
package com.hexa.tts.service.test;

import java.util.Date;

import org.joda.time.LocalDate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hexa.tts.entities.Person;
import com.hexa.tts.entities.enums.Gender;
import com.hexa.tts.services.impl.PersonService;
import com.hexa.tts.tests.BaseTestObject;

/**
 * @author fruaku
 * @date 10.10.2014 22:23:29
 */
public class PersonServiceTest extends BaseTestObject
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("************** BEGIN TEST**************");
		String config = "spring-test-config.xml";
		ClassPathXmlApplicationContext context = buildApplicationContext(config);
		try
		{
			PersonService personService = (PersonService) context.getBean("personService");
			
			Person person = new Person();
			person.setFirstname("FruAnyer");
			person.setLastname("taran");
			person.setGender(Gender.MALE);
			//person.setBirthday(new Date(1981, 11, 24));
			personService.addPerson(person);
		}
		finally
		{
			closeApplicationContext();
		}
		System.out.println("************** END TEST *****************");
	}
}
