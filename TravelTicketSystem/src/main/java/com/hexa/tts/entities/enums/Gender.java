/**
 * 
 */
package com.hexa.tts.entities.enums;

/**
 * @author Davy Franck Wanmeni
 * @date 26.09.2014 22:34:15
 */
public enum Gender 
{
	FEMALE("gender.female"),
	MALE("gender.male");
	
	private String MessageKey;
	
	private Gender(String MessageKey)
	{
		this.MessageKey = MessageKey;
	}

	/**
	 * @return the messageKey
	 */
	public String getMessageKey() {
		return MessageKey;
	}
	
	
}
