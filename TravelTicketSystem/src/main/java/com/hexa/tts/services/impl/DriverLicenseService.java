/**
 * 
 */
package com.hexa.tts.services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.springframework.stereotype.Service;

import com.hexa.tts.dao.IDriverLicenseDao;
import com.hexa.tts.services.IDriverLicenseService;

/**
 * @author slow
 * @date 03.10.2014 20:21:44
 */
@Service
public class DriverLicenseService implements IDriverLicenseService
{
  @EJB
	private IDriverLicenseDao driverLicenseDao;
}
