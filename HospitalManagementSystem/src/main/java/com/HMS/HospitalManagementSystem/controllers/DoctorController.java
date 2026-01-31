package com.HMS.HospitalManagementSystem.controllers;

import com.HMS.HospitalManagementSystem.models.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors") // ROUTE
public class DoctorController {

    @GetMapping
    public List<Doctor> getAllDoctors() {
        System.out.println("Fetching all doctors");
        return null;
    }

    @PostMapping
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        System.out.println("Creating doctor");
        return doctor;
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id) {
        System.out.println("Fetching doctor by ID");
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Long id) {
        System.out.println("Deleting doctor with ID: " + id);
    }

    @PutMapping("/{id}")
    public void updateDoctor(@PathVariable Long id) {
        System.out.println("Updating doctor with ID: " + id);
    }
}
