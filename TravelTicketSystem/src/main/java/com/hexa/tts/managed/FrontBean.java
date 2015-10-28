/**
 * 
 */
package com.hexa.tts.managed;

import javax.enterprise.inject.spi.BeanManager;






/**
 * @author fruaku
 * @date 26.01.2015 21:00:21
 */
public abstract class FrontBean<FACADE>
{
	/**
	 * Facade for PM
	 */
	private FACADE facade;

	/**
	 * @param facade
	 */
	protected FrontBean(final FACADE facade, String facadeName)
	{
		this();
		this.facade = facade;
	}

	/**
	 * 
	 */
	protected FrontBean()
	{
	}
	
	private void initializeFacade(BeanManager beanManager){
		
		if(null != facade){
			return;
		}
		Class<?> type = null;
	}
}
