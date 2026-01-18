package com.example.GoComentRideApplication.GoCometRideApplication.service;

import com.example.GoComentRideApplication.GoCometRideApplication.dto.DriverLocationDTO;
import com.example.GoComentRideApplication.GoCometRideApplication.dto.RideDTO;
import com.example.GoComentRideApplication.GoCometRideApplication.dto.RideRequestDTO;

public interface DriverService {
    void updateLocation(Long id, DriverLocationDTO driverLocationDTO);
}
