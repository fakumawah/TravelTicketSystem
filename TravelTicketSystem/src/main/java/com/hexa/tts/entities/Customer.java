/**
 * 
 */
package com.hexa.tts.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.hexa.tts.entities.enums.CustomerType;

/**
 * @author fruaku
 * @date 03.09.2014 01:32:21
 */
@Entity
@Table(name="CUSTOMER")
@DiscriminatorValue("C")
public class Customer extends Person
{

	private String customerNumber; // (Number on card - e.g C12345)

	@Column(columnDefinition = "enum('STANDARD', 'PERSONAL', 'ECONOMY', 'BUSINESS', 'VIP')")
	@Enumerated(EnumType.STRING)
	private CustomerType customerType; // (Standard, Personal, Economy, Business, VIP) - e.g Business can be made to pay per invoice

	// ------------------------ Getter/Setter -----------------
	/**
	 * @return the customerNumber
	 */
	public String getCustomerNumber()
	{
		return customerNumber;
	}

	/**
	 * @param customerNumber
	 *          the customerNumber to set
	 */
	public void setCustomerNumber(String customerNumber)
	{
		this.customerNumber = customerNumber;
	}

	/**
	 * @return the customerType
	 */
	public CustomerType getCustomerType()
	{
		return customerType;
	}

	/**
	 * @param customerType
	 *          the customerType to set
	 */
	public void setCustomerType(CustomerType customerType)
	{
		this.customerType = customerType;
	}
}
