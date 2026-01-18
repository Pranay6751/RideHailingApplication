package com.example.GoComentRideApplication.GoCometRideApplication.service;

import com.example.GoComentRideApplication.GoCometRideApplication.dto.RideDTO;
import com.example.GoComentRideApplication.GoCometRideApplication.dto.RideRequestDTO;

public interface RideService {
    RideDTO createRide(RideRequestDTO rideRequestDTO);
    RideDTO getRide(Long id);
}
