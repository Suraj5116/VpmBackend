package com.service;

import java.util.List;

import com.model.Vehicle;

public interface VehicleService {
    List<Vehicle> getAllVehicles();
    Vehicle getVehicleById(Long id);
    List<Vehicle> getVehiclesByUserId(Long userId);
    Vehicle saveVehicle(Vehicle vehicle);
    void deleteVehicle(Long id);
}

