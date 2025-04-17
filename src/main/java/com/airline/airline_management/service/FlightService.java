package com.airline.airline_management.service;

import com.airline.airline_management.model.entity.Flight;

import java.time.LocalDateTime;

public interface FlightService {
    Flight createFlight(Integer flightNumber, String origin, String destination, LocalDateTime departureTime, LocalDateTime arrivalTime);
}
