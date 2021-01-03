package com.bac.spring.boot.components;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bac.spring.boot.entities.Reservation;
import com.bac.spring.boot.repositories.ReservationRepository;

@Component
public class SampleDataCLR implements CommandLineRunner{
	
	private final ReservationRepository reservationRepository;
	
	@Autowired
	public SampleDataCLR(ReservationRepository reservationRepository) {
		this.reservationRepository = reservationRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Stream.of("Josh", "Philip", "Dave", "Spencer", 
				"Stephane", "Stephane", "Mark", "Mark", 
				"Rob", "Rod", "Jennifer", "Tamao")
				.forEach(name -> reservationRepository.save(new Reservation(name)));
		
		reservationRepository.findAll().forEach(System.out::println);
		
	}
	
}
