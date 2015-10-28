/**
 * 
 */
package com.hexa.tts.entities.enums;

/**
 * @author slow
 * @date 05.10.2014 14:26:14
 */
public enum BusStatus {
	
	Unknow("busstatus.unknow"),
	Operational("busstatus.operational"), 
	InMaintenance("busstatus.inmaintenance"), 
	Planned("busstatus.planned"),  
	Broken("busstatus.broken");
	
	private String messageKey;
	
	private BusStatus(){
		
	}

	private BusStatus(String messageKey)
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
