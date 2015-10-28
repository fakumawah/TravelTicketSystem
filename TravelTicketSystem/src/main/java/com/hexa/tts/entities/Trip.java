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

import org.joda.time.LocalTime;

import com.hexa.tts.entities.enums.BusLoadingStatus;
import com.hexa.tts.entities.enums.TripStatus;

/**
 * @author fruaku
 * @date 07.09.2014 17:07:40
 */
@Entity
@Table(name = "TRIP")
public class Trip extends BaseObject
{
	@Id
	@Column(name = "TRIP_ID")
	@GeneratedValue
	private long tripId;
	
	private String name;   // (e.g DLA-YDE)
	
	private String departureCity;
	
	private String destinationCity;
	
	private double price;
	
	private double distance;
	
	private LocalTime departureTime;
	
	private LocalTime expectedArrivalTime;
	
//	@Column(columnDefinition = "enum('FULL','EMPTY','LOADING','UNKNOWN')")
//	@Enumerated(EnumType.STRING)
//	//private BusLoadingStatus busLoadingStatus; //(FULL, Empty, Loading, Unknow)
//	
//	@Column(columnDefinition = "enum('PLANNED','WAITING','DEPARTING', 'DEPARTED', 'ARRIVING', 'ARRIVED', 'ONTHEWAY')")
//	@Enumerated(EnumType.STRING)
//	//private TripStatus tripStatus; //(Planned, Waiting, Departing, Departed, Arriving, Arrived, Onway)
	
	private int seatCount;
	
	private int ticketCount; //(number of tickets sold. If ticketCount == seatCount = Bus is full)
}
