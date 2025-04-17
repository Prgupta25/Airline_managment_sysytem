package com.airline.airline_management.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="booking")
public class Booking {
    @Id
    private int bookingId;
    private Integer flightNumber;
    private Integer price;
    private String passengerName;
}
