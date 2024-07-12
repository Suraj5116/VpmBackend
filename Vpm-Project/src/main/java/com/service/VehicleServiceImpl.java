package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.VehicleRepository;
import com.model.Vehicle;

@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;
    
    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }
    
    @Override
    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.findById(id).orElseThrow();
    }
    
    @Override
    public List<Vehicle> getVehiclesByUserId(Long userId) {
        return vehicleRepository.findByUserId(userId);
    }
    
    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
    
    @Override
    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }
}

