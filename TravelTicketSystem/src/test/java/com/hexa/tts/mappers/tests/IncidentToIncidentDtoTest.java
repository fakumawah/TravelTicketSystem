/**
 * 
 */
package com.hexa.tts.mappers.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.hexa.tts.dto.IncidentDto;
import com.hexa.tts.entities.Incident;
import com.hexa.tts.mappers.Mapper;


/**
 * @author slow
 * @date 20.09.2014 16:14:53
 */
public class IncidentToIncidentDtoTest extends ObjectsToMap {

	@Test
	public void testIncidenToIncidenDtoMap() {
		
		// prepare 
		Incident incident = getFakeIncidentToMap();
		
		// sut & act 
		IncidentDto incidentDto = new Mapper().map(incident, IncidentDto.class);
		
		// tests
		
		// base object
		assertEquals(incidentDto.getCreator(), incident.getCreator());
		assertEquals(incidentDto.getCreateDate(), incident.getCreateDate());		
		assertEquals(incidentDto.getModifyDate(), incident.getModifyDate());
		assertEquals(incidentDto.getModifyer(), incident.getModifyer());
		
		// incident
		assertEquals(incidentDto.getIncidentDate(), incident.getIncidentDate());
		assertEquals(incidentDto.getIncidentId(), incident.getIncidentId());
		assertEquals(incidentDto.getIncidentType(), incident.getIncidentType());
		assertEquals(incidentDto.getInitiator(), incident.getInitiator());
		assertEquals(incidentDto.getComment(), incident.getComment());
		
		assertEquals(incidentDto.getReporterId(), incident.getReporterId());
		assertEquals(incidentDto.getReporterName(), incident.getReporter().getFirstname() +" "+ incident.getReporter().getLastname());
		
		
	}
	
	
	@Test
	public void testIncidenDtoToIncidenMap() {
		
		// prepare 
		IncidentDto incidentDto = getFakeIncidentDtoToMap();
		
		// sut & act 
		Incident incident = new Mapper().map(incidentDto, Incident.class);
		
		// tests
		
		// base object
		assertEquals(incidentDto.getCreator(), incident.getCreator());
		assertEquals(incidentDto.getCreateDate(), incident.getCreateDate());		
		assertEquals(incidentDto.getModifyDate(), incident.getModifyDate());
		assertEquals(incidentDto.getModifyer(), incident.getModifyer());
		
		// incident
		assertEquals(incidentDto.getIncidentDate(), incident.getIncidentDate());
		assertEquals(incidentDto.getIncidentId(), incident.getIncidentId());
		assertEquals(incidentDto.getIncidentType(), incident.getIncidentType());
		assertEquals(incidentDto.getInitiator(), incident.getInitiator());
		assertEquals(incidentDto.getComment(), incident.getComment());
		
		assertEquals(incidentDto.getReporterId(), incident.getReporterId());	
		
	}
}
