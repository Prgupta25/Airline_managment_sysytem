package com.airline.airline_management.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "flight")
public class Flight {
    @Id
    private int flightNumber;
    @Column(nullable = false)
    private String origin;
    @Column(nullable = false)
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

}
