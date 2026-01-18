package com.example.GoComentRideApplication.GoCometRideApplication.controller;

import com.example.GoComentRideApplication.GoCometRideApplication.dto.RideDTO;
import com.example.GoComentRideApplication.GoCometRideApplication.dto.RideRequestDTO;
import com.example.GoComentRideApplication.GoCometRideApplication.entity.Ride;
import com.example.GoComentRideApplication.GoCometRideApplication.service.RideService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rides")
public class RideController {

    private final RideService rideService;

    @PostMapping("/createride")
    public ResponseEntity<RideDTO> createRide(@RequestBody RideRequestDTO rideRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(rideService.createRide(rideRequestDTO));
    }

    @GetMapping("/getride/{id}")
    public ResponseEntity<RideDTO> getRide(@PathVariable Long id) {
        return ResponseEntity.ok(rideService.getRide(id));
    }

}

