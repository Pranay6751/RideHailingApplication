//package com.example.GoComentRideApplication.GoCometRideApplication.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//public class SurgeService {
//
//    @Autowired
//    private StringRedisTemplate redisTemplate;
//
//    public double calculateSurge(String region, String tenantId) {
//
//        int activeRides = Integer.parseInt(
//                redisTemplate.opsForValue()
//                        .getOrDefault("rides:active:" + region, "1")
//        );
//
//        int availableDrivers = Integer.parseInt(
//                redisTemplate.opsForValue()
//                        .getOrDefault("drivers:available:" + region, "1")
//        );
//
//        double surge = (double) activeRides / availableDrivers;
//        return Math.min(3.0, Math.max(1.0, surge));
//    }
//}
//
