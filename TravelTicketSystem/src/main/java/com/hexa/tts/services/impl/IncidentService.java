/**
 * 
 */
package com.hexa.tts.services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.springframework.stereotype.Service;

import com.hexa.tts.dao.IIncidentDao;
import com.hexa.tts.services.IIncidentService;

/**
 * @author slow
 * @date 03.10.2014 20:23:12
 */
@Service
public class IncidentService implements IIncidentService
{
  @EJB
	private IIncidentDao incidentDao;

}
