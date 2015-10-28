/**
 * 
 */
package com.hexa.tts.dao.impl;

import org.hibernate.HibernateException;

import com.hexa.tts.dao.IPersonDao;
import com.hexa.tts.entities.Customer;
import com.hexa.tts.entities.Person;
import com.hexa.tts.util.HibernateUtil;

/**
 * @author fruaku
 * @date 03.10.2014 19:24:48
 */
public class PersonDao extends BaseDao<Person> implements IPersonDao
{

	/* (non-Javadoc)
	 * @see com.hexa.tts.dao.IPersonDao#findCustomer(java.lang.Long)
	 */
	@Override
	public Customer findCustomer(Long id)
	{
		Customer cust = null;
		try
		{
			startTransaction();
			cust = (Customer) getSession().get(Customer.class, id);
			closeTransaction();
		}
		catch (HibernateException e)
		{
			handleException(e);
		}
		finally
		{
			closeSession();
		}
		return cust;
	}

}
