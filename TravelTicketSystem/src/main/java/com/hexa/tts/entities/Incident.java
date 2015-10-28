/**
 * 
 */
package com.hexa.tts.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.joda.time.LocalDateTime;

import com.hexa.tts.entities.enums.IncidentType;

/**
 * @author fruaku
 * @date 03.09.2014 21:51:13
 */
@Entity
@Table(name = "INCIDENT")
public class Incident extends BaseObject
{
	@Id
	@Column(name = "INCIDENT_ID")
	@GeneratedValue
	private long incidentId;
	
  @Column(columnDefinition = "enum('FIGHT','ACCIDENT','THEFT','DAMAGE')")
	@Enumerated(EnumType.STRING)
	private IncidentType incidentType; // howto set those enums values as enum java class snd still heve them here as attributes/annotations ??
	
	private String initiator;  

	private String comment;
	
	private LocalDateTime incidentDate;
	
	private long reporterId;  
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="personId")
	private Person reporter; 
	
  //---------------Getters/Setters------------------------

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
	 * @return the reporter
	 */
	public Person getReporter() {
		return reporter;
	}

	/**
	 * @param reporter the reporter to set
	 */
	public void setReporter(Person reporter) {
		this.reporter = reporter;
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

 

}

