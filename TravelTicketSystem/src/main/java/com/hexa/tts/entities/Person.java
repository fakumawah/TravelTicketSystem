/**
 * 
 */
package com.hexa.tts.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.hexa.tts.entities.enums.Gender;

/**
 * @author fruaku
 * @date 02.09.201400:47:07
 */
@Entity
@Table(name = "PERSON")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "discriminator", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "P")
public class Person extends BaseObject 
{
	@Id
	@Column(name = "PERSON_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long personId;

	@Size(min=2, max=30) 
	private String firstname;

	@Size(min=2, max=30) 
	private String lastname;

	@Column(columnDefinition = "enum('MALE','FEMALE')")
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@DateTimeFormat(pattern="dd/MM/yyyy")
  @Past
	private Date birthday;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId")
	public Address address; 

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "contactDetailId")
	private ContactDetail contactDetail; 
	
	// ------------------------- Getter und Setter-------------------------

	/**
	 * @return the personId
	 */
	public long getPersonId() {
		return personId;
	}

	/**
	 * @param personId
	 *            the personId to set
	 */
	public void setPersonId(long personId) {
		this.personId = personId;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname
	 *            the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname
	 *            the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday
	 *            the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the contactDetail
	 */
	public ContactDetail getContactDetail() {
		return contactDetail;
	}

	/**
	 * @param contactDetail
	 *            the contactDetail to set
	 */
	public void setContactDetail(ContactDetail contactDetail) {
		this.contactDetail = contactDetail;
	}

	public String getNameFormatted() {
		return this.getFirstname() + " " + this.getLastname();
	}
}
