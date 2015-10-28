/**
 * 
 */
package com.hexa.tts.services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hexa.tts.dao.IAgencyDao;
import com.hexa.tts.services.IAgencyService;

/**
 * @author slow
 * @date 03.10.2014 20:02:42
 */
@Component
public class AgencyService implements IAgencyService
{

	@Autowired
	private IAgencyDao agencyDao;

}
