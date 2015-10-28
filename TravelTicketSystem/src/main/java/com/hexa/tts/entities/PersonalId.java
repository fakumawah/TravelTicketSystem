/**
 * 
 */
package com.hexa.tts.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author wilsine
 * @date 10.09.2014 21:21:41
 */
public class PersonalId extends BaseObject
{
	@Id
	@Column(name = "PERSONALID_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long personalIDId;

	private String personalIdCardNumber;

	private Date issueDate;

	private Date validUntil;

	private String issueVenue;

	private boolean isValid;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "personId")
	private Person Person; // (1:1)

 //---------------Getters/Setters------------------------
	
	/**
	 * @return the personalIdCardNumber
	 */
	public String getPersonalIdCardNumber()
	{
		return personalIdCardNumber;
	}

	/**
	 * @param personalIdCardNumber the personalIdCardNumber to set
	 */
	public void setPersonalIdCardNumber(String personalIdCardNumber)
	{
		this.personalIdCardNumber = personalIdCardNumber;
	}

	/**
	 * @return the personalIDId
	 */
	public long getPersonalIDId()
	{
		return personalIDId;
	}

	/**
	 * @param personalIDId the personalIDId to set
	 */
	public void setPersonalIDId(long personalIDId)
	{
		this.personalIDId = personalIDId;
	}

	/**
	 * @return the issueDate
	 */
	public Date getIssueDate()
	{
		return issueDate;
	}

	/**
	 * @param issueDate the issueDate to set
	 */
	public void setIssueDate(Date issueDate)
	{
		this.issueDate = issueDate;
	}

	/**
	 * @return the validUntil
	 */
	public Date getValidUntil()
	{
		return validUntil;
	}

	/**
	 * @param validUntil the validUntil to set
	 */
	public void setValidUntil(Date validUntil)
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
	 * @return the isValid
	 */
	public boolean isValid()
	{
		return isValid;
	}

	/**
	 * @param isValid the isValid to set
	 */
	public void setValid(boolean isValid)
	{
		this.isValid = isValid;
	}

	/**
	 * @return the person
	 */
	public Person getPerson()
	{
		return Person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person)
	{
		Person = person;
	}

}
