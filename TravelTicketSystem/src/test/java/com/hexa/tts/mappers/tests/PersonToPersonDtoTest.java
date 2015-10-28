/**
 * 
 */
package com.hexa.tts.mappers.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.hexa.tts.dto.PersonDto;
import com.hexa.tts.entities.Address;
import com.hexa.tts.entities.ContactDetail;
import com.hexa.tts.entities.Person;
import com.hexa.tts.mappers.Mapper;

/**
 * @author slow
 * @date 20.09.2014 02:38:32
 */
public class PersonToPersonDtoTest extends ObjectsToMap{

	// howto run test with surefire plugin 
	// http://maven.apache.org/surefire/maven-surefire-plugin/index.html
	
	
	@Test
	public void testPersonToPersonDtoMap() {
		
		// prepare 
		Person person = this.getFakePersonToMap();
		Address address = person.getAddress();
		ContactDetail contactDetail = person.getContactDetail();
		
		// sut (system / class under test)
		Mapper testee = new Mapper();
		
		// act		
		PersonDto personDto = testee.map(person, PersonDto.class);
		
		// tests
		// address
		assertEquals(personDto.getAddressCity(), address.getCity());
		assertEquals(personDto.getAddressCountry(), address.getCountry());
		
		// contact details
		assertEquals(personDto.getPhoneNumber1(), contactDetail.getPhoneNumber1());
		assertEquals(personDto.getPhoneNumber2(), contactDetail.getPhoneNumber2());
		assertEquals(personDto.getPhoneNumber3(), contactDetail.getPhoneNumber3());
		assertEquals(personDto.getFax(), contactDetail.getFax());
		
	}
	
	
	
	
	@Test
	public void testPersonDtoToPersonMap() {
		
		// prepare 
		PersonDto personDto = this.getFakePersonDtoToMap();
		
		// sut & act
		Mapper testee = new Mapper();
		Person person = testee.map(personDto, Person.class);
		
		// tests
		assertEquals(person.getContactDetail().getFax(), personDto.getFax());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


