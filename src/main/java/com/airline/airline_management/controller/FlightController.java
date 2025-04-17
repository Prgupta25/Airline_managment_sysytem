package com.airline.airline_management.controller;

import com.airline.airline_management.Repository.FlightRepository;
import com.airline.airline_management.model.entity.Flight;
import com.airline.airline_management.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "api/v2/")
public class FlightController {
    @Autowired
    FlightRepository flightRepository;
    @Autowired
    private FlightService flightService;

    @GetMapping(value = "/getFlightdetails")
    public String getFlightdetails() {
        return "flight details";
    }

    @PostMapping(value = "/addFlight")
    public ResponseEntity<Object> addFlight(@RequestBody Flight flight) {
        Flight newFlight = flightService.createFlight(flight.getFlightNumber(), flight.getOrigin(), flight.getDestination(), flight.getDepartureTime(), flight.getArrivalTime());
        return new ResponseEntity<>(newFlight, HttpStatus.CREATED);
    }
}
