package com.airline.airline_management.service;

import com.airline.airline_management.model.entity.Booking;
import com.airline.airline_management.model.response.FlightBookingResponse;

public interface BookingService {
    FlightBookingResponse getBookingDetails(Integer bookingId);
    Booking createBooking(Integer bookingId, Integer flightNumber, Integer price, String passengerName);
}
