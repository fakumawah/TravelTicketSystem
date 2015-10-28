/**
 * 
 */
package com.hexa.tts.tests;

import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author slow
 * @date 20.09.2014 10:19:16
 */
public class BaseTestObject
{

	/**
	 * fake data factory : generate fake data of different types
	 * 
	 * here some links on about creating test data wit datafactory framework
	 * http://www.andygibson.net/blog/article/generate-test-data-with-datafactory/
	 * 
	 */
	protected DataFactory fakeDataFactory = new DataFactory();

	private static ClassPathXmlApplicationContext classPathXmlApplicationContext;
	
	/**
	 * Builds a ClassPathXmlApplicationContext, if it hasn't been already.
	 * 
	 * @param config
	 * @return
	 */
	public static ClassPathXmlApplicationContext buildApplicationContext(String config)
	{
		if (classPathXmlApplicationContext == null)
		{
			classPathXmlApplicationContext = new ClassPathXmlApplicationContext(config);
			return classPathXmlApplicationContext;
		}
		return classPathXmlApplicationContext;
	}
	
	/**
	 * Close Application context
	 */
	public static void closeApplicationContext()
	{
		if (classPathXmlApplicationContext != null)
		{
			classPathXmlApplicationContext.close();
		}
	}
	
	
}
