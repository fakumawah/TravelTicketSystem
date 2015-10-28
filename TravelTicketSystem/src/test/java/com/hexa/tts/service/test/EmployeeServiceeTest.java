/**
 * 
 */
package com.hexa.tts.service.test;

import java.util.Date;

import org.joda.time.LocalDate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hexa.tts.entities.Employee;
import com.hexa.tts.entities.enums.Gender;
import com.hexa.tts.services.impl.EmployeeService;
import com.hexa.tts.tests.BaseTestObject;

/**
 * @author fruaku
 * @date 14.10.2014 23:28:59
 */
public class EmployeeServiceeTest extends BaseTestObject
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
			EmployeeService personService = (EmployeeService) context.getBean("employeeService");
			
			Employee employee = new Employee();
			employee.setFirstname("Neu");
			employee.setLastname("Isenburg");
			employee.setGender(Gender.FEMALE);
			//employee.setBirthday(new Date(2014, 11, 24));
			employee.setEmployeeNumber("D123456");
			employee.setGrade("Chef");
			personService.addEmployee(employee);
		}
		finally
		{
			closeApplicationContext();
		}
		System.out.println("************** END TEST *****************");

	}

}
