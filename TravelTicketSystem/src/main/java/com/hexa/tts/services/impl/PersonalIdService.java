/**
 * 
 */
package com.hexa.tts.services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.springframework.stereotype.Service;

import com.hexa.tts.dao.IPersonalIdDao;
import com.hexa.tts.services.IPersonalIdService;

/**
 * @author slow
 * @date 03.10.2014 20:24:16
 */
@Service
public class PersonalIdService implements IPersonalIdService
{
	@EJB
	private IPersonalIdDao personalIdDao;

}
