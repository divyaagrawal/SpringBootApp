package com.java.magicPos.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Piyush Tomar
 *
 */
@Entity
@Table(name = "User")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long bookingId;
	@Column
	String psngrName;
	@Column
	String departure;
	@Column
	String destination;
	@Column
	Date travelDate;
	
	
	//getter setter method
	
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public String getPsngrName() {
		return psngrName;
	}
	public void setPsngrName(String psngrName) {
		this.psngrName = psngrName;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	@Override
	public String toString() {
		return "User [bookingId=" + bookingId + ", psngrName=" + psngrName
				+ ", departure=" + departure + ", destination=" + destination
				+ ", travelDate=" + travelDate + "]";
	}
	
	
}
