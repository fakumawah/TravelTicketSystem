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

import com.hexa.tts.dao.IBusDao;
import com.hexa.tts.dao.impl.BusDao;
import com.hexa.tts.services.IBusService;

/**
 * @author slow
 * @date 03.10.2014 20:18:49
 */
@Component
public class BusService implements IBusService
{

	@Autowired
	IBusDao busDao;

}
