/**
 * 
 */
package com.hexa.tts.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import com.hexa.tts.entities.enums.ObjectStatus;

/**
 * This class has properties used in all entity classes.
 * 
 * @author fruaku
 */
@MappedSuperclass
public abstract class BaseObject
{
	private String creator;
	
	private Date createDate;
	
	private String modifyer;
	
	private Date modifyDate;
	
	private String deletor;
	
	private Date deleteDate;
	
	@Column(columnDefinition = "enum('ACTIVE','BLOCKED','DELETED','UNKNOWN')")
	@Enumerated(EnumType.STRING)
	private ObjectStatus status; // ACTIVE, BLOCKED, DELETED, UNKNOWN
	
	/**
	 *  Flag to tell if object has been deleted
	 */
	private boolean isDeleted; 

//-------------Getters/Setters-----------------------------
	/**
	 * @return the creator
	 */
	public String getCreator()
	{
		return creator;
	}

	/**
	 * @param creator the creator to set
	 */
	public void setCreator(String creator)
	{
		this.creator = creator;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate()
	{
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}

	/**
	 * @return the modifyer
	 */
	public String getModifyer()
	{
		return modifyer;
	}

	/**
	 * @param modifyer the modifyer to set
	 */
	public void setModifyer(String modifyer)
	{
		this.modifyer = modifyer;
	}

	/**
	 * @return the modifyDate
	 */
	public Date getModifyDate()
	{
		return modifyDate;
	}

	/**
	 * @param modifyDate the modifyDate to set
	 */
	public void setModifyDate(Date modifyDate)
	{
		this.modifyDate = modifyDate;
	}

	/**
	 * @return the deletor
	 */
	public String getDeletor()
	{
		return deletor;
	}

	/**
	 * @param deletor the deletor to set
	 */
	public void setDeletor(String deletor)
	{
		this.deletor = deletor;
	}

	/**
	 * @return the deleteDate
	 */
	public Date getDeleteDate()
	{
		return deleteDate;
	}

	/**
	 * @param deleteDate the deleteDate to set
	 */
	public void setDeleteDate(Date deleteDate)
	{
		this.deleteDate = deleteDate;
	}

	/**
	 * @return the isDeleted
	 */
	public boolean isDeleted() {
		return isDeleted;
	}

	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
}
