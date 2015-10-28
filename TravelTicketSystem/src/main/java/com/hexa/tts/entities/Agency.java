/**
 * 
 */
package com.hexa.tts.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author fruaku
 * @date 02.10.2014 00:29:10
 */
@Entity
@Table(name = "AGENCY")
public class Agency extends BaseObject
{
	@Id
	@Column(name = "AGENCY_ID")
	@GeneratedValue
	private long agencyId;
	
	private long agencyLeadId;  // Id of person in system
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addressId")
	private Address address; //(1:1)
		
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="contactDetailId")
	private ContactDetail contactDetail; // (1:1)

	//----------------------Getters/Setters--------------------------
	/**
	 * @return the agencyId
	 */
	public long getAgencyId()
	{
		return agencyId;
	}

	/**
	 * @param agencyId the agencyId to set
	 */
	public void setAgencyId(long agencyId)
	{
		this.agencyId = agencyId;
	}

	/**
	 * @return the agencyLeadId
	 */
	public long getAgencyLeadId()
	{
		return agencyLeadId;
	}

	/**
	 * @param agencyLeadId the agencyLeadId to set
	 */
	public void setAgencyLeadId(long agencyLeadId)
	{
		this.agencyLeadId = agencyLeadId;
	}

	/**
	 * @return the address
	 */
	public Address getAddress()
	{
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address)
	{
		this.address = address;
	}

	/**
	 * @return the contactDetail
	 */
	public ContactDetail getContactDetail()
	{
		return contactDetail;
	}

	/**
	 * @param contactDetail the contactDetail to set
	 */
	public void setContactDetail(ContactDetail contactDetail)
	{
		this.contactDetail = contactDetail;
	}
}
