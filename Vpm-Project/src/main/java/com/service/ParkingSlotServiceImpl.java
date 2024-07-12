package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ParkingSlotRepository;
import com.model.ParkingSlot;

@Service
public class ParkingSlotServiceImpl implements ParkingSlotService {
    @Autowired
    private ParkingSlotRepository parkingSlotRepository;
    
    @Override
    public List<ParkingSlot> getAllParkingSlots() {
        return parkingSlotRepository.findAll();
    }
    
    @Override
    public ParkingSlot getParkingSlotById(Long id) {
        return parkingSlotRepository.findById(id).orElseThrow();
    }
    
    @Override
    public List<ParkingSlot> getAvailableParkingSlots() {
        return parkingSlotRepository.findByIsAvailable(true);
    }
    
    @Override
    public ParkingSlot saveParkingSlot(ParkingSlot parkingSlot) {
        return parkingSlotRepository.save(parkingSlot);
    }
    
    @Override
    public void deleteParkingSlot(Long id) {
        parkingSlotRepository.deleteById(id);
    }
}

