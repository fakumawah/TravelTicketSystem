/**
 * 
 */
package com.hexa.tts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hexa.tts.annotation.Email;

/**
 * @author fruaku
 * @date 02.09.2014 01:31:57
 */
@Entity
@Table(name = "CONTACTDETAIL")
public class ContactDetail extends BaseObject
{
	@Id
	@Column(name = "CONTACTDETAIL_ID")
	@GeneratedValue
	private long contactDetailId;
	
	private String phoneNumber1;
	
	private String phoneNumber2;
	
	private String phoneNumber3;
	
	private String fax;	
	
	private String email1;
	
	private String email2;
	
	private String website;
	
	private String twitter;
	
	private String facebook;
	
	private String skype;
		
//	private Agency agency;  // Agency
//	
//	private Person person;  // Person	
	
	//----------------------Getters/Setters--------------------------
	/**
	 * @return the contactDetailId
	 */
	public long getContactDetailId() {
		return contactDetailId;
	}

	/**
	 * @param contactDetailId the contactDetailId to set
	 */
	public void setContactDetailId(long contactDetailId) {
		this.contactDetailId = contactDetailId;
	}

	/**
	 * @return the phoneNumber1
	 */
	public String getPhoneNumber1() {
		return phoneNumber1;
	}

	/**
	 * @param phoneNumber1 the phoneNumber1 to set
	 */
	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}

	/**
	 * @return the phoneNumber2
	 */
	public String getPhoneNumber2() {
		return phoneNumber2;
	}

	/**
	 * @param phoneNumber2 the phoneNumber2 to set
	 */
	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}

	/**
	 * @return the phoneNumber3
	 */
	public String getPhoneNumber3() {
		return phoneNumber3;
	}

	/**
	 * @param phoneNumber3 the phoneNumber3 to set
	 */
	public void setPhoneNumber3(String phoneNumber3) {
		this.phoneNumber3 = phoneNumber3;
	}

	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * @return the email1
	 */
	@Email
	public String getEmail1() {
		return email1;
	}

	/**
	 * @param email1 the email1 to set
	 */
	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	/**
	 * @return the email2
	 */
	public String getEmail2() {
		return email2;
	}

	/**
	 * @param email2 the email2 to set
	 */
	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}

	/**
	 * @return the twitter
	 */
	public String getTwitter() {
		return twitter;
	}

	/**
	 * @param twitter the twitter to set
	 */
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	/**
	 * @return the facebook
	 */
	public String getFacebook() {
		return facebook;
	}

	/**
	 * @param facebook the facebook to set
	 */
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	/**
	 * @return the skype
	 */
	public String getSkype() {
		return skype;
	}

	/**
	 * @param skype the skype to set
	 */
	public void setSkype(String skype) {
		this.skype = skype;
	}

//	/**
//	 * @return the agency
//	 */
//	public Agency getAgency() {
//		return agency;
//	}
//
//	/**
//	 * @param agency the agency to set
//	 */
//	public void setAgency(Agency agency) {
//		this.agency = agency;
//	}
//
//	/**
//	 * @return the person
//	 */
//	public Person getPerson() {
//		return person;
//	}
//
//	/**
//	 * @param person the person to set
//	 */
//	public void setPerson(Person person) {
//		this.person = person;
//	}


}
