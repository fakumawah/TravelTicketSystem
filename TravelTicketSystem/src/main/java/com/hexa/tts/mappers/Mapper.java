/**
 * 
 */
package com.hexa.tts.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import com.hexa.tts.dto.IncidentDto;
import com.hexa.tts.dto.PersonDto;
import com.hexa.tts.entities.Incident;
import com.hexa.tts.entities.Person;

/**
 * @author slow
 * @date 20.09.2014 00:33:08
 */
public class Mapper extends ModelMapper {

	public Mapper() {
		super();

		configurePersonToPersonDtoMap();
		configurePersonDtoToPersonMap();

		configureIncidentToIncidentDtoMap();
		configureIncidentDtoToIncidentMap();
	}

	public void configurePersonToPersonDtoMap() {

		// PERSON => PERSON_DTO
		PropertyMap<Person, PersonDto> personToPersonDtoMap = new PropertyMap<Person, PersonDto>() {
			protected void configure() {

				// DO NOT WRITE SOMETHINGS LIKE THIS WHILE MAPPING PROPERTIES
				// here
				// Address sourceAddress = source.getAddress();
				// ContactDetail contactDetail = source.getContactDetail();

				// mappings

				// contact detail
				map().setPhoneNumber1(
						source.getContactDetail().getPhoneNumber1());
				map().setPhoneNumber2(
						source.getContactDetail().getPhoneNumber2());
				map().setPhoneNumber3(
						source.getContactDetail().getPhoneNumber3());
				map().setFax(source.getContactDetail().getFax());
				map().setEmail1(source.getContactDetail().getEmail1());
				map().setEmail2(source.getContactDetail().getEmail2());
				map().setWebsite(source.getContactDetail().getWebsite());
				map().setTwitter(source.getContactDetail().getTwitter());
				map().setFacebook(source.getContactDetail().getFacebook());
				map().setSkype(source.getContactDetail().getSkype());

				// address
				map().setAddressStreet(source.getAddress().getStreet());
				map().setAddressCity(source.getAddress().getCity());
				map().setAddressAddressId(source.getAddress().getAddressId());
				map().setAddressCountry(source.getAddress().getCountry());
				map().setAddressHouseNumber(
						source.getAddress().getHouseNumber());
				map().setAddressPostalBox(source.getAddress().getPostalBox());
				map().setAddressPostalCode(source.getAddress().getPostalCode());
				map().setAddressRegion(source.getAddress().getRegion());
				map().setAddressState(source.getAddress().getState());
			}
		};
		this.addMappings(personToPersonDtoMap);

	}

	/**
	 * Comments
	 */
	public void configurePersonDtoToPersonMap() {

		// PERSON_DTO => PERSON
		PropertyMap<PersonDto, Person> personDtoToPersonMap = new PropertyMap<PersonDto, Person>() {
			protected void configure() {

				// mappings

				// contact detail
				map().getContactDetail().setFax(source.getFax());

				// address
				map().getAddress().setPerson(null); // avoid circular references
													// between person and
													// address

				map().getAddress().setAddressId(source.getAddressAddressId());
				map().getAddress().setHouseNumber(
						source.getAddressHouseNumber());
				map().getAddress().setCountry(source.getAddressCountry());
				map().getAddress().setCity(source.getAddressCity());

			}
		};
		this.addMappings(personDtoToPersonMap);
	}

	public void configureIncidentToIncidentDtoMap() {

		// INCIDENT => INCIDENT_DTO
		PropertyMap<Incident, IncidentDto> incidentToIncidentDtoMap = new PropertyMap<Incident, IncidentDto>() {
			protected void configure() {

				// mappings

				// base object
				map().setCreateDate(source.getCreateDate());
				map().setCreator(source.getCreator());
				map().setModifyDate(source.getModifyDate());
				map().setModifyer(source.getModifyer());
				//
				map().setReporterId(source.getReporterId());
				map().setReporterName(source.getReporter().getNameFormatted());
				map().setIncidentDate(source.getIncidentDate());
				map().setInitiator(source.getInitiator());
				map().setComment(source.getComment());
				map().setIncidentType(source.getIncidentType());

			}
		};
		this.addMappings(incidentToIncidentDtoMap);
	}

	public void configureIncidentDtoToIncidentMap() {

		// INCIDENT => INCIDENT_DTO
		PropertyMap<IncidentDto, Incident> incidentDtoToIncidentMap = new PropertyMap<IncidentDto, Incident>() {
			protected void configure() {

				// mappings

				// base object
				map().setCreateDate(source.getCreateDate());
				map().setCreator(source.getCreator());
				map().setModifyDate(source.getModifyDate());
				map().setModifyer(source.getModifyer());
				//
				map().setReporterId(source.getReporterId());
				map().setReporter(null); // los it later 
				map().setIncidentDate(source.getIncidentDate());
				map().setInitiator(source.getInitiator());
				map().setComment(source.getComment());
				map().setIncidentType(source.getIncidentType());

			}
		};
		this.addMappings(incidentDtoToIncidentMap);
	}

}
