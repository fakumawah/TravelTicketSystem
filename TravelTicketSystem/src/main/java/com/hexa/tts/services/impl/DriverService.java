/**
 * 
 */
package com.hexa.tts.services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.springframework.stereotype.Service;

import com.hexa.tts.dao.IDriverDao;
import com.hexa.tts.services.IDriverService;

/**
 * @author slow
 * @date 03.10.2014 20:22:19
 */
@Service
public class DriverService implements IDriverService
{
  @EJB
	private IDriverDao driverDao;

}
