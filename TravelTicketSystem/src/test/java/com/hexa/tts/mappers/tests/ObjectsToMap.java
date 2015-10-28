/**
 * 
 */
package com.hexa.tts.mappers.tests;

import java.util.ArrayList;
import java.util.Arrays;

import org.joda.time.LocalDateTime;

import com.hexa.tts.dto.IncidentDto;
import com.hexa.tts.dto.PersonDto;
import com.hexa.tts.entities.Address;
import com.hexa.tts.entities.ContactDetail;
import com.hexa.tts.entities.Incident;
import com.hexa.tts.entities.Person;
import com.hexa.tts.entities.enums.IncidentType;
import com.hexa.tts.tests.BaseTestObject;

/**
 * @author slow
 * @date 20.09.2014 09:22:43
 */
public class ObjectsToMap extends BaseTestObject {

	protected Address getFakeAdressToMap() {

		Address address = new Address();
		address.setCity("Douala");
		address.setCountry("Germany");

		return address;
	}

	protected ContactDetail getFakeContactDetailToMap() {

		ContactDetail contactDetail = new ContactDetail();

		contactDetail.setPhoneNumber1(fakeDataFactory.getNumberText(9));
		contactDetail.setPhoneNumber2(fakeDataFactory.getNumberText(9));
		contactDetail.setPhoneNumber3(fakeDataFactory.getNumberText(9));

		contactDetail.setFax(fakeDataFactory.getNumberText(9));

		contactDetail.setEmail1(fakeDataFactory.getEmailAddress());
		contactDetail.setEmail2(fakeDataFactory.getEmailAddress());

		contactDetail.setWebsite("http://" + fakeDataFactory.getRandomWord());
		contactDetail.setTwitter("http://twitter.com/"
				+ fakeDataFactory.getRandomWord());
		contactDetail.setFacebook("http://facebook.com/"
				+ fakeDataFactory.getRandomWord());

		contactDetail.setSkype(fakeDataFactory.getRandomText(10));

		return contactDetail;
	}

	protected Person getFakePersonToMap() {

		Person person = new Person();

		person.setPersonId(fakeDataFactory.getNumberBetween(0, 400));

		person.setFirstname(fakeDataFactory.getFirstName());
		person.setAddress(getFakeAdressToMap());
		person.setContactDetail(getFakeContactDetailToMap());

		return person;
	}

	protected PersonDto getFakePersonDtoToMap() {

		PersonDto personDto = new PersonDto();

		personDto.setFax(fakeDataFactory.getNumberText(9));

		personDto.setAddressAddressId(0);
		personDto.setAddressCountry("Germany");
		personDto.setAddressCity(fakeDataFactory.getCity());

		return personDto;

	}

	protected Incident getFakeIncidentToMap() {

		Incident incident = new Incident();

		incident.setCreator(fakeDataFactory.getLastName());
		incident.setCreateDate(fakeDataFactory.getBirthDate());
		incident.setModifyer(fakeDataFactory.getLastName());
		incident.setModifyDate(fakeDataFactory.getBirthDate());

		Person person = getFakePersonToMap();
		incident.setReporter(person);
		incident.setReporterId(person.getPersonId());
		incident.setComment(fakeDataFactory.getRandomText(200));

		ArrayList<IncidentType> enumList = new ArrayList<IncidentType>(
				Arrays.asList(IncidentType.values()));
		incident.setIncidentType(fakeDataFactory.getItem(enumList));

		incident.setInitiator(fakeDataFactory.getBusinessName());
		incident.setIncidentDate(LocalDateTime.now());

		return incident;
	}

	protected IncidentDto getFakeIncidentDtoToMap() {

		IncidentDto incidentDto = new IncidentDto();

		incidentDto.setCreator(fakeDataFactory.getLastName());
		incidentDto.setCreateDate(fakeDataFactory.getBirthDate());
		incidentDto.setModifyer(fakeDataFactory.getLastName());
		incidentDto.setModifyDate(fakeDataFactory.getBirthDate());

		incidentDto.setReporterId(fakeDataFactory.getNumberBetween(0, 400));
		incidentDto.setComment(fakeDataFactory.getRandomText(200));

		ArrayList<IncidentType> enumList = new ArrayList<IncidentType>(
				Arrays.asList(IncidentType.values()));
		incidentDto.setIncidentType(fakeDataFactory.getItem(enumList));

		incidentDto.setInitiator(fakeDataFactory.getBusinessName());
		incidentDto.setIncidentDate(LocalDateTime.now());

		return incidentDto;
	}
}
