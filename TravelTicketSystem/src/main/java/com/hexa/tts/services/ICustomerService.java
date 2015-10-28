/**
 * 
 */
package com.hexa.tts.services;

import com.hexa.tts.entities.Customer;

/**
 * @author slow
 * @date 03.10.2014 20:13:38
 */
public interface ICustomerService{
		
	void saveOrUpdate(Customer t);

	void update(Customer t);	
}
