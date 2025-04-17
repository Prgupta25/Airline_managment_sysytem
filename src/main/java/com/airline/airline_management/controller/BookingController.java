package com.airline.airline_management.controller;

import com.airline.airline_management.Repository.BookingRepository;
import com.airline.airline_management.model.entity.Booking;
import com.airline.airline_management.model.response.FlightBookingResponse;
import com.airline.airline_management.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping(value = "/{bookingId}")
    public ResponseEntity<Object> getBookingDetails(@PathVariable Integer bookingId) throws Exception {
        FlightBookingResponse flightBookingResponse = bookingService.getBookingDetails(bookingId);
       return new ResponseEntity<>(flightBookingResponse, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> createBooking(@RequestBody Booking booking) throws Exception {
        Booking newBooking = bookingService.createBooking(booking.getBookingId(), booking.getFlightNumber(), booking.getPrice(), booking.getPassengerName());
        return new ResponseEntity<>(newBooking, HttpStatus.CREATED);
    }

}