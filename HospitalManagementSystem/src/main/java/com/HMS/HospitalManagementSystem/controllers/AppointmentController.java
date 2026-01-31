package com.HMS.HospitalManagementSystem.controllers;

import com.HMS.HospitalManagementSystem.models.Appointment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    @GetMapping
    public List<Appointment> getAllAppointments() {
        System.out.println("Fetching all appointments");
        return null;
    }

    @PostMapping
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        System.out.println("Creating appointment");
        return appointment;
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@PathVariable Long id) {
        System.out.println("Fetching appointment by ID " + id);
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable Long id) {
        System.out.println("Deleting appointment with ID: " + id);
    }

    @PutMapping("/{id}")
    public void updateAppointment(@PathVariable Long id) {
        System.out.println("Updating appointment with ID: " + id);
    }
}
