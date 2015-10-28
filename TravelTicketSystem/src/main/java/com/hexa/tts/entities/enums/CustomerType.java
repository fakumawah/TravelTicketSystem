/**
 * 
 */
package com.hexa.tts.entities.enums;

/**
 * @author Davy Franck Wanmeni
 * @date 26.09.2014 22:37:05
 */
public enum CustomerType 
{
	STANDARD("customertype.standard"),
	PERSONAL("customertype.personal"),
	ECONOMY("customertype.economy"),
	BUSINESS("customertype.business"),
	VIP("customertype.vip");
	
	private String messageKey;

	private CustomerType(String messageKey)
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
