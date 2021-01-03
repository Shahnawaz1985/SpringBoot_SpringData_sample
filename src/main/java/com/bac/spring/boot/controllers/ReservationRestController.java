package com.bac.spring.boot.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bac.spring.boot.entities.Reservation;
import com.bac.spring.boot.repositories.ReservationRepository;

@RestController
public class ReservationRestController {
	
	private final ReservationRepository reservationRepository; 
	
	@Autowired
	public ReservationRestController(ReservationRepository reservationRepository) {
		this.reservationRepository = reservationRepository;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/all-reservations")
	public Collection<Reservation> reservations(){
		return this.reservationRepository.findAll();
	}
}
