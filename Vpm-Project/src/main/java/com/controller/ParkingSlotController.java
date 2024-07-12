package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.ParkingSlot;
import com.service.ParkingSlotService;

@RestController
@RequestMapping("/parking-slots")
public class ParkingSlotController {
    @Autowired
    private ParkingSlotService parkingSlotService;
    
    @GetMapping
    public List<ParkingSlot> getAllParkingSlots() {
        return parkingSlotService.getAllParkingSlots();
    }
    
    @GetMapping("/{id}")
    public ParkingSlot getParkingSlotById(@PathVariable Long id) {
        return parkingSlotService.getParkingSlotById(id);
    }
    
    @PostMapping
    public ParkingSlot createParkingSlot(@RequestBody ParkingSlot parkingSlot) {
        return parkingSlotService.saveParkingSlot(parkingSlot);
    }
    
    @PutMapping("/{id}")
    public ParkingSlot updateParkingSlot(@PathVariable Long id, @RequestBody ParkingSlot parkingSlot) {
        ParkingSlot existingParkingSlot = parkingSlotService.getParkingSlotById(id);
        existingParkingSlot.setSlotNumber(parkingSlot.getSlotNumber());
        existingParkingSlot.setIsAvailable(parkingSlot.getIsAvailable());
        // update other fields as needed
        return parkingSlotService.saveParkingSlot(existingParkingSlot);
    }

    
    @DeleteMapping("/{id}")
    public void deleteParkingSlot(@PathVariable Long id) {
        parkingSlotService.deleteParkingSlot(id);
    }
}

