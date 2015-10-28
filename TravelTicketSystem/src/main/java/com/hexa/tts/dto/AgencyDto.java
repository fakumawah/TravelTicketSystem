/**
 * 
 */
package com.hexa.tts.dto;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author slow
 * @date 20.09.2014 00:18:51
 */
public class AgencyDto {

	private long agencyId;

	private long agencyLeadId;

	private long addressAddressId;

	private String addressStreet;

	@NotEmpty
	private String addressHouseNumber;

	private String addressCity;

	private int addressPostalCode;

	private String addressPostalBox;

	private String addressRegion;

	private String addressState;

	private String addressCountry;

	private String phoneNumber1;
	
	private String phoneNumber2;

	private String phoneNumber3;

	public String fax;

	private String email1;

	private String email2;

	private String website;

	private String twitter;

	private String facebook;

	private String skype;
	
	
}
