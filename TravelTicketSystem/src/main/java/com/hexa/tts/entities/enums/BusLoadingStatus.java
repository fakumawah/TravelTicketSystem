/**
 * 
 */
package com.hexa.tts.entities.enums;

/**
 * @author slow
 * @date 10.10.2014 20:42:04
 */
public enum BusLoadingStatus {
	
	Unknow("busloadingstatus.unknow"), 
	Full("busloadingstatus.full"), 
	Empty("busloadingstatus.empty"), 
	Loading("busloadingstatus.loading");
	
	private String messageKey;

	private BusLoadingStatus(String messageKey)
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
