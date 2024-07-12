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

import com.model.ParkingCharge;
import com.service.ParkingChargeService;

@RestController
@RequestMapping("/parking-charges")
public class ParkingChargeController {
    @Autowired
    private ParkingChargeService parkingChargeService;
    
    @GetMapping
    public List<ParkingCharge> getAllParkingCharges() {
        return parkingChargeService.getAllParkingCharges();
    }
    
    @GetMapping("/{id}")
    public ParkingCharge getParkingChargeById(@PathVariable Long id) {
        return parkingChargeService.getParkingChargeById(id);
    }
    
    @PostMapping
    public ParkingCharge createParkingCharge(@RequestBody ParkingCharge parkingCharge) {
        return parkingChargeService.saveParkingCharge(parkingCharge);
    }
    
    @PutMapping("/{id}")
    public ParkingCharge updateParkingCharge(@PathVariable Long id, @RequestBody ParkingCharge parkingCharge) {
        return parkingChargeService.updateParkingCharge(id, parkingCharge);
    }

    

    @DeleteMapping("/{id}")
    public void deleteParkingCharge(@PathVariable Long id) {
        parkingChargeService.deleteParkingCharge(id);
    }
}

