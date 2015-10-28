/**
 * 
 */
package com.hexa.tts.exceptions;

/**
 * @author fruaku
 * @date 08.09.2014 01:22:43
 */
public class DataAccessLayerException extends RuntimeException
{
	public DataAccessLayerException()	{	}

	/**
	 * 
	 * @param message
	 */
	public DataAccessLayerException(String message)
	{
		super(message);
	}

	/**
	 * 
	 * @param cause
	 */
	public DataAccessLayerException(Throwable cause)
	{
		super(cause);
	}

	/**
	 * 
	 * @param message
	 * @param cause
	 */
	public DataAccessLayerException(String message, Throwable cause)
	{
		super(message, cause);
	}
}