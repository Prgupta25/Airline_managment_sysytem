package com.airline.airline_management.model.response;

import com.airline.airline_management.model.entity.Booking;
import com.airline.airline_management.model.entity.Flight;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingResponse {
    private Booking booking;
    private Flight flight;
}
