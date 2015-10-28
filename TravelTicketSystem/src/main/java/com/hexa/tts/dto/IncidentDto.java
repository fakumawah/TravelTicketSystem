/**
 * 
 */
package com.hexa.tts.dto;

import java.util.Date;

import org.joda.time.LocalDateTime;

import com.hexa.tts.entities.enums.IncidentType;

/**
 * @author slow
 * @date 20.09.2014 00:15:01
 */
public class IncidentDto {

	private String creator;

	/**
	 * @return the creator
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * @param creator the creator to set
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the modifyer
	 */
	public String getModifyer() {
		return modifyer;
	}

	/**
	 * @param modifyer the modifyer to set
	 */
	public void setModifyer(String modifyer) {
		this.modifyer = modifyer;
	}

	/**
	 * @return the modifyDate
	 */
	public Date getModifyDate() {
		return modifyDate;
	}

	/**
	 * @param modifyDate the modifyDate to set
	 */
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	/**
	 * @return the incidentId
	 */
	public long getIncidentId() {
		return incidentId;
	}

	/**
	 * @param incidentId the incidentId to set
	 */
	public void setIncidentId(long incidentId) {
		this.incidentId = incidentId;
	}

	/**
	 * @return the incidentType
	 */
	public IncidentType getIncidentType() {
		return incidentType;
	}

	/**
	 * @param incidentType the incidentType to set
	 */
	public void setIncidentType(IncidentType incidentType) {
		this.incidentType = incidentType;
	}

	/**
	 * @return the initiator
	 */
	public String getInitiator() {
		return initiator;
	}

	/**
	 * @param initiator the initiator to set
	 */
	public void setInitiator(String initiator) {
		this.initiator = initiator;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the incidentDate
	 */
	public LocalDateTime getIncidentDate() {
		return incidentDate;
	}

	/**
	 * @param incidentDate the incidentDate to set
	 */
	public void setIncidentDate(LocalDateTime incidentDate) {
		this.incidentDate = incidentDate;
	}

	/**
	 * @return the reporterId
	 */
	public long getReporterId() {
		return reporterId;
	}

	/**
	 * @param reporterId the reporterId to set
	 */
	public void setReporterId(long reporterId) {
		this.reporterId = reporterId;
	}

	/**
	 * @return the reporterName
	 */
	public String getReporterName() {
		return reporterName;
	}

	/**
	 * @param reporterName the reporterName to set
	 */
	public void setReporterName(String reporterName) {
		this.reporterName = reporterName;
	}

	private Date createDate;

	private String modifyer;

	private Date modifyDate;

	private long incidentId;

	private IncidentType incidentType;

	private String initiator;

	private String comment;

	private LocalDateTime incidentDate;

	private long reporterId;

	private String reporterName;
	

}
