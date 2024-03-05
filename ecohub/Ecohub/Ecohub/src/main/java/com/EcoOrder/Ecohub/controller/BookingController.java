package com.EcoOrder.Ecohub.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EcoOrder.Ecohub.entity.Booking;
import com.EcoOrder.Ecohub.service.BookingService;

import jakarta.validation.Valid;
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BookingController {
	@Autowired
	BookingService bookingService;
	
	@PostMapping("/saveBooking")
	public ResponseEntity<Booking> saveBooking(@Valid @RequestBody Booking booking){
		return new ResponseEntity<Booking>(bookingService.registerBooking(booking),HttpStatus.CREATED);
	}
	
	@GetMapping("/getBookingDetail/{bookingId}")
	public ResponseEntity<Booking> fetchBookingDetail(@PathVariable("bookingId") int bookingId){
		return new ResponseEntity<Booking>(bookingService.fetchBookingDetail(bookingId), HttpStatus.OK);	
	}
	
	@DeleteMapping("/deleteBooking/{bookingId}")
	public ResponseEntity<String> deleteBookings(@PathVariable("bookingId") int bookingId){
		bookingService.removeBooking(bookingId);
		return new ResponseEntity<String>("<h1>Deleted Bookings Record, Kindly contact customer care for refund policy based on bookings </h1>", HttpStatus.OK);
	}
}



