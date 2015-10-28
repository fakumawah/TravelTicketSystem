/**
 * 
 */
package com.hexa.tts.dao;

import com.hexa.tts.entities.Customer;
import com.hexa.tts.entities.Person;

/**
 * @author fruaku
 * @date 03.10.2014 20:20:00
 */
public interface IPersonDao extends IBaseDao<Person, Long>
{
	Customer findCustomer(Long id);
}