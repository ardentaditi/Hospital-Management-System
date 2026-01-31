package com.HMS.HospitalManagementSystem.controllers;

import com.HMS.HospitalManagementSystem.models.Patient;
import com.HMS.HospitalManagementSystem.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;   // ✅ REQUIRED IMPORT
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    // GET ALL PATIENTS WITH PAGINATION
    // Example: /api/v1/patients?page=0&size=5
    @GetMapping
    public Page<Patient> getAllPatients(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size
    ) {
        System.out.println("Fetching patients with pagination");
        return patientService.getAllPatients(page, size);
    }

    // CREATE PATIENT
    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        System.out.println("Creating patient");
        return patientService.createPatient(patient);
    }

    // GET PATIENT BY ID
    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        System.out.println("Fetching patient by ID");
        return patientService.getPatientById(id);
    }

    // DELETE PATIENT
    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        patientService.deletePatient(id);
    }

    // UPDATE PATIENT
    @PutMapping("/{id}")
    public Patient updatePatient(
            @PathVariable Long id,
            @RequestBody Patient patient
    ) {
        return patientService.updatePatient(id, patient);
    }
}
