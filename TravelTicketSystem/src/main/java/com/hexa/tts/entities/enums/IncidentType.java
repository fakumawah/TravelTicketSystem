/**
 * 
 */
package com.hexa.tts.entities.enums;

/**
 * @author slow
 * @date 20.09.2014 15:55:21
 */
public enum IncidentType {

	FIGHT("incidenttype.fight"),
	ACCIDENT("incidenttype.accident"),
	THEFT("incidenttype.theft"),
	DAMAGE("incidenttype.damage");
	
	private String MessageKey;
	
	private IncidentType(String messageKey)
	{
		this.MessageKey = messageKey;
	}

	/**
	 * @return the messageKey
	 */
	public String getMessageKey() {
		return MessageKey;
	}
	
	
}
