package com.example.GoComentRideApplication.GoCometRideApplication.service.Impl;

import com.example.GoComentRideApplication.GoCometRideApplication.dto.RideDTO;
import com.example.GoComentRideApplication.GoCometRideApplication.dto.RideRequestDTO;
import com.example.GoComentRideApplication.GoCometRideApplication.entity.Ride;
import com.example.GoComentRideApplication.GoCometRideApplication.repository.RideRepository;
import com.example.GoComentRideApplication.GoCometRideApplication.service.RideService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideServiceImpl implements RideService {

    private final RideRepository rideRepository;
    private final ModelMapper modelMapper;

    @Override
    public RideDTO createRide(RideRequestDTO dto) {
        Ride ride = modelMapper.map(dto, Ride.class);
        ride.setStatus("REQUESTED");
        ride.setSurgeMultiplier(1.2);
        Ride newride = rideRepository.save(ride);
        return modelMapper.map(newride, RideDTO.class);
    }

    @Override
        public RideDTO getRide(Long id) {
        Ride ride = rideRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Ride Id not found "+id));
        return modelMapper.map(ride, RideDTO.class);
    }
}
