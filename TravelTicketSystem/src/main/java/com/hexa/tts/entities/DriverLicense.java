/**
 * 
 */
package com.hexa.tts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.joda.time.LocalDate;

import com.hexa.tts.entities.enums.DriverLicenseCategory;

/**
 * @author fruaku
 * @date 03.09.2014 21:14:14
 */
@Entity
@Table(name="DRIVERLICENSE")
public class DriverLicense extends BaseObject
{
	@Id
	@Column(name = "DRIVERLICENSE_ID")
	@GeneratedValue
	private long driverLicenseId;
	
	private LocalDate issueDate;
	
	private LocalDate validUntil;
	
	private String issueVenue;
	
	@Enumerated(EnumType.STRING)
	private DriverLicenseCategory category;  // C, CE
	
	@ManyToOne
	@JoinColumn(name = "driverId")
	private Driver driver;   //  (n:1)

	//---------------Getters/Setters------------------------
	
	/**
	 * @return the driverLicenseId
	 */
	public long getDriverLicenseId()
	{
		return driverLicenseId;
	}

	/**
	 * @param driverLicenseId the driverLicenseId to set
	 */
	public void setDriverLicenseId(long driverLicenseId)
	{
		this.driverLicenseId = driverLicenseId;
	}

	/**
	 * @return the issueDate
	 */
	public LocalDate getIssueDate()
	{
		return issueDate;
	}

	/**
	 * @param issueDate the issueDate to set
	 */
	public void setIssueDate(LocalDate issueDate)
	{
		this.issueDate = issueDate;
	}

	/**
	 * @return the validUntil
	 */
	public LocalDate getValidUntil()
	{
		return validUntil;
	}

	/**
	 * @param validUntil the validUntil to set
	 */
	public void setValidUntil(LocalDate validUntil)
	{
		this.validUntil = validUntil;
	}

	/**
	 * @return the issueVenue
	 */
	public String getIssueVenue()
	{
		return issueVenue;
	}

	/**
	 * @param issueVenue the issueVenue to set
	 */
	public void setIssueVenue(String issueVenue)
	{
		this.issueVenue = issueVenue;
	}

	/**
	 * @return the category
	 */
	public DriverLicenseCategory getCategory()
	{
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(DriverLicenseCategory category)
	{
		this.category = category;
	}

	/**
	 * @return the driver
	 */
	public Driver getDriver()
	{
		return driver;
	}

	/**
	 * @param driver the driver to set
	 */
	public void setDriver(Driver driver)
	{
		this.driver = driver;
	}
	
}
