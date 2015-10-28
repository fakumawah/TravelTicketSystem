/**
 * 
 */
package com.hexa.tts.entities.enums;

/**
 * @author slow
 * @date 05.10.2014 14:25:29
 */
public enum PetrolType 
{
	UNKNOWN("petroltype.unknown"),
	BENZIN("petroltype.benzin"), 
	DIESEL("petroltype.diesel");
	
	private String messageKey;

	/**
	 * @return the messageKey
	 */
	private PetrolType(String message) {
		this.messageKey = message;
	}

	/**
	 * @param messageKey the messageKey to set
	 */
	public String getMessageKey() {
		return  this.messageKey;
	}
}
