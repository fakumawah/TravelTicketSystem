/**
 * 
 */
package com.hexa.tts.services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.springframework.stereotype.Service;

import com.hexa.tts.dao.ITripDao;
import com.hexa.tts.services.ITripService;

/**
 * @author slow
 * @date 03.10.2014 20:26:06
 */
@Service
public class TripService implements ITripService
{
	@EJB
	private ITripDao tripDao;
}
