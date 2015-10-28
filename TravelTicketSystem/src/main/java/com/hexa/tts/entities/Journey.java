/**
 * 
 */
package com.hexa.tts.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author wilsine
 * @date 10.09.2014 21:12:55
 */
public class Journey  extends BaseObject {

	private long journeyId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "driverId")
	private Driver driver; // (1:1)

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "busId")
	private Bus Bus; // (1:1);

	@OneToMany(cascade = CascadeType.ALL) //TODO: nhibernate anotation
	@JoinColumn(name = "tripId")
	private List<Trip> trips; // (1:n);
	
	@OneToOne(mappedBy="journey", cascade=CascadeType.ALL)
	private Ticket ticket;

	private List<String> minor;
	
  //---------------Getters/Setters------------------------

	/**
	 * @return the journeyId
	 */
	public long getJourneyId()
	{
		return journeyId;
	}

	/**
	 * @param journeyId the journeyId to set
	 */
	public void setJourneyId(long journeyId)
	{
		this.journeyId = journeyId;
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

	/**
	 * @return the bus
	 */
	public Bus getBus()
	{
		return Bus;
	}

	/**
	 * @param bus the bus to set
	 */
	public void setBus(Bus bus)
	{
		Bus = bus;
	}

	/**
	 * @return the trips
	 */
	public List<Trip> getTrips()
	{
		return trips;
	}

	/**
	 * @param trips the trips to set
	 */
	public void setTrips(List<Trip> trips)
	{
		this.trips = trips;
	}

	/**
	 * @return the minor
	 */
	public List<String> getMinor()
	{
		return minor;
	}

	/**
	 * @param minor the minor to set
	 */
	public void setMinor(List<String> minor)
	{
		this.minor = minor;
	}

}
