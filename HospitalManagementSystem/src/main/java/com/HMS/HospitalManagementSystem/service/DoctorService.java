package com.HMS.HospitalManagementSystem.service;

import com.HMS.HospitalManagementSystem.models.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    public List<Doctor> getAllDoctors() {
        try {
            System.out.println("into Doctor service layer");
            return null;
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public Doctor getDoctorById(Long id) {
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public Doctor createDoctor(Doctor doctor) {
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public void deleteDoctor(Long id) {
        try {
            // delete logic
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
        }
    }

    public Doctor updateDoctor(Long id) {
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }
}
