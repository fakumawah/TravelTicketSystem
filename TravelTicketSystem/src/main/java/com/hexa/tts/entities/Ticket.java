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
 * @author fruaku
 * @date 07.09.2014 17:49:58
 */
@Entity
@Table(name = "TICKET")
public class Ticket extends BaseObject
{
	@Id
	@Column(name = "TICKET_ID")
	@GeneratedValue
	private long ticketId;
	
	private long tripId;  // (1:n) - we can have many tickets for 1 Trip
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="journeyId")
	private Journey journey;  // (1:1) @TODO I think it should be 1:n
	
	private String seatNr;
	
	private long customerId;   //(1:1) - Person who bought the ticket
	
	private long employeeId;  //(1:1) - Person who sold the ticket
	
	private long agencyId;   //(1:1) - Agency  where ticket was sold

	//----Getters/Setters---------------------
	/**
	 * @return the ticketId
	 */
	public long getTicketId()
	{
		return ticketId;
	}

	/**
	 * @param ticketId the ticketId to set
	 */
	public void setTicketId(long ticketId)
	{
		this.ticketId = ticketId;
	}

	/**
	 * @return the tripId
	 */
	public long getTripId()
	{
		return tripId;
	}

	/**
	 * @param tripId the tripId to set
	 */
	public void setTripId(long tripId)
	{
		this.tripId = tripId;
	}

	/**
	 * @return the journey
	 */
	public Journey getJourney()
	{
		return journey;
	}

	/**
	 * @param journey the journey to set
	 */
	public void setJourney(Journey journey)
	{
		this.journey = journey;
	}

	/**
	 * @return the seatNr
	 */
	public String getSeatNr()
	{
		return seatNr;
	}

	/**
	 * @param seatNr the seatNr to set
	 */
	public void setSeatNr(String seatNr)
	{
		this.seatNr = seatNr;
	}

	/**
	 * @return the customerId
	 */
	public long getCustomerId()
	{
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(long customerId)
	{
		this.customerId = customerId;
	}

	/**
	 * @return the employeeId
	 */
	public long getEmployeeId()
	{
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(long employeeId)
	{
		this.employeeId = employeeId;
	}

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

}
