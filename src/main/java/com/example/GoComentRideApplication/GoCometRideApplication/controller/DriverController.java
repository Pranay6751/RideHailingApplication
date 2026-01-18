package com.example.GoComentRideApplication.GoCometRideApplication.controller;

import com.example.GoComentRideApplication.GoCometRideApplication.dto.DriverLocationDTO;
import com.example.GoComentRideApplication.GoCometRideApplication.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/drivers")
public class DriverController {

    private final DriverService driverService;

    @PostMapping("/{id}/location")
    public void updateLocation(
            @PathVariable Long id,
            @RequestBody DriverLocationDTO dto
    ) {
        driverService.updateLocation(id, dto);
    }
}

