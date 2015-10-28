/**
 * 
 */
package com.hexa.tts.services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexa.tts.dao.ICrudOperations;
import com.hexa.tts.dao.IEmployeeDao;
import com.hexa.tts.entities.Employee;
import com.hexa.tts.services.IEmployeeService;

/**
 * @author slow
 * @date 03.10.2014 20:22:46
 */
@Service
public class EmployeeService implements IEmployeeService
{
	@EJB
	private IEmployeeDao employeeDao;
	
//	@Autowired
//	private ICrudOperations<Employee> employeeCrud;

	/**
	 * 
	 * @param person
	 */
	public void addEmployee(Employee employee)
	{
		employeeDao.saveOrUpdate(employee);
	}
}
