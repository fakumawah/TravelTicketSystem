/**
 * 
 */
package com.hexa.tts.entities.enums;

/**
 * @author Davy Franck Wanmeni
 * @date 26.09.2014 22:39:50
 */
public enum ObjectStatus
{
	ACTIVE("objectstatus.active"),
	UNKNOWN("objectstatus.unknown"),
	BLOCKED("objectstatus.blocked"),  
	CHECKED("objectstatus.checked"), 
	UNCHECKED("objectstatus.unchecked"), 
	DELETED("objectstatus.deleted");

	private String messageKey;

	private ObjectStatus(String messageKey)
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