package com.airline.airline_management.service.impl;

import com.airline.airline_management.Repository.FlightRepository;
import com.airline.airline_management.model.entity.Flight;
import com.airline.airline_management.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;


@Service
public class FlightServiceImpl implements FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public Optional<Flight> getFlightDetails(int flightNumber) {
        return flightRepository.findById(flightNumber);
    }

    @Override
    public Flight createFlight(Integer flightNumber, String origin, String destination, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        Flight flight = new Flight(flightNumber, origin, destination, departureTime, arrivalTime);
        return flightRepository.save(flight);
    }
}
