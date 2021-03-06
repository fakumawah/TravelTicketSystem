/**
 * 
 */
package com.hexa.tts.services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.springframework.stereotype.Service;

import com.hexa.tts.dao.IJourneyDao;
import com.hexa.tts.services.IJourneyService;

/**
 * @author slow
 * @date 03.10.2014 20:23:43
 */
@Service
public class JourneyService implements IJourneyService
{
  @EJB
	private IJourneyDao journeyDao;
}
