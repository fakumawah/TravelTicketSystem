/**
 * 
 */
package com.hexa.tts.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.LocalDateTime;

/**
 * @author fruaku
 * @date 07.09.2014 18:15:51
 */
@Entity
@Table(name = "STATISTICS")
public class Statistics
{
	@Id
	@Column(name = "STATISTICS_ID")
	@GeneratedValue
	private long statisticId;

	private String ip;

	private LocalDateTime date;

	/**
	 * @return the statisticId
	 */
	public long getStatisticId()
	{
		return statisticId;
	}

	/**
	 * @param statisticId the statisticId to set
	 */
	public void setStatisticId(long statisticId)
	{
		this.statisticId = statisticId;
	}

	/**
	 * @return the ip
	 */
	public String getIp()
	{
		return ip;
	}

	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip)
	{
		this.ip = ip;
	}

	/**
	 * @return the date
	 */
	public LocalDateTime getDate()
	{
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date)
	{
		this.date = date;
	}

}
