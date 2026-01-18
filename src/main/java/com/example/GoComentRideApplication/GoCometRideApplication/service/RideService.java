package com.example.GoComentRideApplication.GoCometRideApplication.service;

import com.example.GoComentRideApplication.GoCometRideApplication.dto.RideDTO;
import com.example.GoComentRideApplication.GoCometRideApplication.dto.RideRequestDTO;

import java.util.List;

public interface RideService {
    RideDTO createRide(RideRequestDTO rideRequestDTO);
    RideDTO getRide(Long id);
    List<RideDTO> getAllRides();
}
