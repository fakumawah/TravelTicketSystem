/**
 * 
 */
package com.hexa.tts.entities.enums;

/**
 * @author slow
 * @date 10.10.2014 20:44:21
 */
public enum TripStatus {

	Planned("tripstatus.planned"), 
	Waiting("tripstatus.waiting"), 
	Departing("tripstatus.departing"), 
	Departed("tripstatus.departed"), 
	Arriving("tripstatus.arriving"), 
	Arrived("tripstatus.arrived"), 
	Onway("tripstatus.onway");
	
	private String messageKey;

	private TripStatus(String messageKey)
	{
		this.messageKey = messageKey;
	}

	/**
	 * @return the messageKey
	 */
	public String getMessageKey()
	{
		return messageKey;
	}
}
