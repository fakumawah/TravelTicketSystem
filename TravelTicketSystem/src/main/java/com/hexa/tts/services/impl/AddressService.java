/**
 * 
 */
package com.hexa.tts.services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.hexa.tts.dao.IAddressDao;
import com.hexa.tts.dao.impl.AddressDao;
import com.hexa.tts.services.IAddressService;

/**
 * @author slow
 * @date 03.10.2014 20:17:58
 */
@Service
public class AddressService implements IAddressService {

	@Autowired
	AddressDao addressDao;
	
}
