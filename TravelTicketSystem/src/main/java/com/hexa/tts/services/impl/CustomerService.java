/**
 * 
 */
package com.hexa.tts.services.impl;

import javax.ejb.EJB;

import org.springframework.stereotype.Service;

import com.hexa.tts.dao.ICustomerDao;
import com.hexa.tts.entities.Customer;
import com.hexa.tts.services.ICustomerService;

/**
 * @author slow
 * @date 03.10.2014 20:20:21
 */
@Service
public class CustomerService implements ICustomerService
{
  @EJB
	private ICustomerDao customerDao;

	/* (non-Javadoc)
	 * @see com.hexa.tts.services.ICustomerService#saveOrUpdate(java.lang.Object)
	 */
	@Override
	public void saveOrUpdate(Customer t)
	{
		customerDao.saveOrUpdate(t);
		
	}

	/* (non-Javadoc)
	 * @see com.hexa.tts.services.ICustomerService#update(java.lang.Object)
	 */
	@Override
	public void update(Customer t)
	{
		// TODO Auto-generated method stub
		
	}
}
