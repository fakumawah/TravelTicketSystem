/**
 * 
 */
package com.hexa.tts.services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hexa.tts.dao.IContactDetailDao;
import com.hexa.tts.services.IContactDetailService;

/**
 * @author slow
 * @date 03.10.2014 20:19:11
 */
@Component
public class ContactDetailService implements IContactDetailService
{

	@EJB
	private IContactDetailDao contactDeatilDao;

}
