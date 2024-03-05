package com.EcoOrder.Ecohub.service;

import com.EcoOrder.Ecohub.entity.Booking;

public interface BookingService {
	
	Booking registerBooking(Booking booking);
			
			//remove existing Bookings record based on id from db table
			void removeBooking(int bookingId);
			
			//fetch Bookings details based on from db table
			Booking fetchBookingDetail(int bookingId);

		   
		}




