package com.EcoOrder.Ecohub.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EcoOrder.Ecohub.entity.Booking;
import com.EcoOrder.Ecohub.exception.BookingIdNotFoundException;
import com.EcoOrder.Ecohub.repository.BookingRepository;
import com.EcoOrder.Ecohub.service.BookingService;




@Service
public class BookingServiceImpl  implements BookingService{
	
	@Autowired
	BookingRepository bookingRepository;

	@Override
	public Booking registerBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bookingRepository.save(booking);
	}

	@Override
	public void removeBooking(int bookingId) {
		bookingRepository.findById(bookingId).orElseThrow(() -> new BookingIdNotFoundException("Enter id is incorrect bookingid, please check"));
		bookingRepository.deleteById(bookingId);
			
		}
		
	

	@Override
	public Booking fetchBookingDetail(int bookingId) {
		// TODO Auto-generated method stub
		return bookingRepository.findById(bookingId).orElseThrow(() -> new BookingIdNotFoundException("Enter id is incorrect bookingid, please check"));
		
	}
}

	