/**
 * 
 */
package com.hexa.tts.services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.springframework.stereotype.Service;

import com.hexa.tts.dao.IStatisticsDao;
import com.hexa.tts.services.IStatisticsService;

/**
 * @author slow
 * @date 03.10.2014 20:24:53
 */
@Service
public class StatisticsService implements IStatisticsService {

	@EJB
	private IStatisticsDao statisticsDao;
}
