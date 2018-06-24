package com.noqcart.crashmeal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="TIMETABLE")
public class TimeTable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TIMETABLEID")
	private Long timeTableId;
	
	@Column(name="FROMTIME")
	private String fromTime;
	@Column(name="TOTIME")
	private String toTime;
	
	//@ManyToOne
	//@JoinColumn(name="AVAILABILITY_ID")
	//private Availability availability;
	
	public Long getTimeTableId() {
		return timeTableId;
	}
	public void setTimeTableId(Long timeTableId) {
		this.timeTableId = timeTableId;
	}
	public String getFromTime() {
		return fromTime;
	}
	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}
	public String getToTime() {
		return toTime;
	}
	public void setToTime(String toTime) {
		this.toTime = toTime;
	}
/*	public Availability getAvailability() {
		return availability;
	}
	public void setAvailability(Availability availability) {
		this.availability = availability;
	}*/
}
