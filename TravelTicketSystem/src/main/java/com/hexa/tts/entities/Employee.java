/**
 * 
 */
package com.hexa.tts.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author fruaku
 * @date 03.09.2014 01:48:05
 */
@Entity
@Table(name="EMPLOYEE")
@DiscriminatorValue("E")
public class Employee extends Person
{
	/*This number appears on the employee card  should be unique*/
	private String employeeNumber;
	
	/* The grade is used to differentiate the employee, in terms of what they can do on the system */
	private String grade;   // We will define this in the configuration files for each customer, probably by installation

	private String role;
//	------------------------------ Getter und Setter  ---------------------------------------------------
	/**
	 * @return the employeeNumber
	 */
	public String getEmployeeNumber() {
		return employeeNumber;
	}

	/**
	 * @param employeeNumber the employeeNumber to set
	 */
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * @return the role
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role)
	{
		this.role = role;
	}
}
