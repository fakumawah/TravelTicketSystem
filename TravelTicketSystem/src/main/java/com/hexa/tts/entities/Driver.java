/**
 * 
 */
package com.hexa.tts.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author fruaku
 * @date 03.09.2014 21:09:14
 */
@Entity
@Table(name="DRIVER")
public class Driver extends Employee
{
	// e.g D12345
	private String driverNumber;
	
	@OneToMany(cascade = {CascadeType.ALL}, mappedBy="driver")
	private List<DriverLicense> driverLicenses;

	
	//---------------Getters/Setters------------------------
	/**
	 * @return the driverNumber
	 */
	public String getDriverNumber()
	{
		return driverNumber;
	}

	/**
	 * @param driverNumber the driverNumber to set
	 */
	public void setDriverNumber(String driverNumber)
	{
		this.driverNumber = driverNumber;
	}

	/**
	 * @return the driverLicenses
	 */
	public List<DriverLicense> getDriverLicenses()
	{
		return driverLicenses;
	}

	/**
	 * @param driverLicenses the driverLicenses to set
	 */
	public void setDriverLicenses(List<DriverLicense> driverLicenses)
	{
		this.driverLicenses = driverLicenses;
	}
	
}
