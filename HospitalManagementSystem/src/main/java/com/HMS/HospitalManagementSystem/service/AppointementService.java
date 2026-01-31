package com.HMS.HospitalManagementSystem.service;

import com.HMS.HospitalManagementSystem.models.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointementService {

    public List<Appointment> getAllAppointments() {
        try {
            System.out.println("into Appointment service layer");
            return null;
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public Appointment getAppointmentById(Long id) {
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public Appointment createAppointment(Appointment appointment) {
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public void deleteAppointment(Long id) {
        try {
            // delete logic
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
        }
    }

    public Appointment updateAppointment(Long id) {
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }
}
