/**
 * 
 */
package com.hexa.tts.services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.springframework.stereotype.Service;

import com.hexa.tts.dao.ITicketDao;
import com.hexa.tts.services.ITicketService;

/**
 * @author slow
 * @date 03.10.2014 20:25:32
 */
@Service
public class TicketService implements ITicketService
{
	@EJB
	private ITicketDao ticketDao;

}
