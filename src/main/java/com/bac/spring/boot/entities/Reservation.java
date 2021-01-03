package com.bac.spring.boot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reservation { //reservations
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String reservationName; //reservation_name

	public Long getId() {
		return id;
	}
	
	public String getReservationName() {
		return reservationName;
	}

	@Override
	public String toString() {
		return "Reservation {id=" + id + ", reservationName=" + reservationName + "}";
	}
	
	public Reservation() {
		
	}
	
	public Reservation(String reservationName) {
		this.reservationName = reservationName;
	}
}