package com.airline.airline_management.service.impl;

import com.airline.airline_management.model.response.FlightBookingResponse;
import com.airline.airline_management.Repository.BookingRepository;
import com.airline.airline_management.Repository.FlightRepository;
import com.airline.airline_management.model.entity.Booking;
import com.airline.airline_management.model.entity.Flight;
import com.airline.airline_management.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private FlightRepository flightRepository;

    @Override
    public FlightBookingResponse getBookingDetails(Integer bookingId) {
        Optional<Booking> bookingOptional = bookingRepository.findById(bookingId);
        return bookingOptional.map(booking -> {
            Optional<Flight> flightOptional = flightRepository.findById(booking.getFlightNumber());
            return flightOptional.map(flight -> new FlightBookingResponse(booking, flight)).orElseThrow(() -> new RuntimeException("Flight not found"));
        }).orElseThrow(() -> new RuntimeException("Booking not found"));
    }

    @Override
    public Booking createBooking(Integer bookingId, Integer flightNumber, Integer price, String passengerName) {
        Booking booking = new Booking(bookingId, flightNumber, price, passengerName);
        return bookingRepository.save(booking);
    }
}