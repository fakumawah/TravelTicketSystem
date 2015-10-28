/**
 * 
 */
package com.hexa.tts.entities.enums;

/**
 * @author fruaku
 * @date 10.10.2014 21:13:56
 */
public enum Role
{
  CUSTOMER("role.customer"), 
  EMPLOYEE("role.employee"),
  ADMIN("role.admin");
  
	private String messageKey;

	private Role(String messageKey)
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
