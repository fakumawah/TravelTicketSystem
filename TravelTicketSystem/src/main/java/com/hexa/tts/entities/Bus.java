/**
 * 
 */
package com.hexa.tts.entities;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.hexa.tts.entities.enums.BusStatus;
import com.hexa.tts.entities.enums.PetrolType;

/**
 * @author wilsine
 * @date 06.09.2014 19:33:13
 */
public class Bus extends BaseObject {

	@Id
	@Column(name = "BUS_ID")
	@GeneratedValue
	private int busId;
	
	private String name;
	
	private String immatriculationNumber;
	
	private int seatCount;
	
	@Enumerated(EnumType.STRING)
	private PetrolType petrolType;	
	
	@Enumerated(EnumType.STRING)
	private BusStatus busStatus;
	
	//----------------------Getters/Setters--------------------------
	
	/**
	 * @return the busId
	 */
	public int getBusId()
	{
		return busId;
	}

	/**
	 * @param busId the busId to set
	 */
	public void setBusId(int busId)
	{
		this.busId = busId;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the immatriculationNumber
	 */
	public String getImmatriculationNumber()
	{
		return immatriculationNumber;
	}

	/**
	 * @param immatriculationNumber the immatriculationNumber to set
	 */
	public void setImmatriculationNumber(String immatriculationNumber)
	{
		this.immatriculationNumber = immatriculationNumber;
	}

	/**
	 * @return the seatCount
	 */
	public int getSeatCount()
	{
		return seatCount;
	}

	/**
	 * @param seatCount the seatCount to set
	 */
	public void setSeatCount(int seatCount)
	{
		this.seatCount = seatCount;
	}

	/**
	 * @return the petrolType
	 */
	public PetrolType getPetrolType()
	{
		return petrolType;
	}

	/**
	 * @param petrolType the petrolType to set
	 */
	public void setPetrolType(PetrolType petrolType)
	{
		this.petrolType = petrolType;
	}

	/**
	 * @return the busStatus
	 */
	public BusStatus getBusStatus()
	{
		return busStatus;
	}

	/**
	 * @param busStatus the busStatus to set
	 */
	public void setBusStatus(BusStatus busStatus)
	{
		this.busStatus = busStatus;
	}



	

	
}
