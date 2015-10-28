/**
 * 
 */
package com.hexa.tts.entities.enums;

/**
 * @author slow
 * @date 20.09.2014 23:06:13
 */
public enum DriverLicenseCategory {

	C("driverlicensecategory.c"),
	CE("driverlicensecategory.ce");
	
	private String messageKey;

	private DriverLicenseCategory(String messageKey)
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
