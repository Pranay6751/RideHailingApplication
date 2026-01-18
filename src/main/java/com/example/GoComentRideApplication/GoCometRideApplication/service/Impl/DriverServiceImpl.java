package com.example.GoComentRideApplication.GoCometRideApplication.service.Impl;

import com.example.GoComentRideApplication.GoCometRideApplication.dto.DriverLocationDTO;
import com.example.GoComentRideApplication.GoCometRideApplication.repository.DriverRepository;
import com.example.GoComentRideApplication.GoCometRideApplication.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {
    private final DriverRepository driverRepository;
    private final ModelMapper modelMapper;
    private StringRedisTemplate redisTemplate;

    @Override
    public void updateLocation(Long id, DriverLocationDTO dto) {

    }

}
