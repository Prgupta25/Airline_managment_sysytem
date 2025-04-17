package com.airline.airline_management.Repository;

import com.airline.airline_management.model.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}
