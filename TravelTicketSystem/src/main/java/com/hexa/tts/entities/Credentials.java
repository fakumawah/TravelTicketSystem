/**
 * 
 */
package com.hexa.tts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hexa.tts.entities.enums.Role;

/**
 * @author fruaku
 * @date 07.09.2014 18:10:09
 */
@Entity
@Table(name="CREDENTIALS")
public class Credentials extends BaseObject
{
	@Id
	@Column(name = "ADDRESS_ID")
	@GeneratedValue
	private long credentialsId;
	
	private String username;
	
	private String password;   // : Varbinary
	
	private String salt; //: Varbinary
	
	@Column(columnDefinition = "enum('CUSTOMER','EMPLOYEE','ADMIN')")
	@Enumerated(EnumType.STRING)
	private Role role;   // ( C, E, A)
	
	//-------Getters/Setters----------
	/**
	 * @return the credentialsId
	 */
	public long getCredentialsId()
	{
		return credentialsId;
	}

	//------------------Getters/Setters--------------------
	/**
	 * @param credentialsId the credentialsId to set
	 */
	public void setCredentialsId(long credentialsId)
	{
		this.credentialsId = credentialsId;
	}

	/**
	 * @return the username
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * @return the salt
	 */
	public String getSalt()
	{
		return salt;
	}

	/**
	 * @param salt the salt to set
	 */
	public void setSalt(String salt)
	{
		this.salt = salt;
	}
}
