package com.HMS.HospitalManagementSystem.service;

import com.HMS.HospitalManagementSystem.models.Patient;
import com.HMS.HospitalManagementSystem.repository.PatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientService {

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    // PAGINATED FETCH
    public Page<Patient> getAllPatients(int page, int size) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            return patientRepository.findAll(pageable);
        } catch (Exception e) {
            logger.error("Error fetching patients", e);
            return Page.empty();
        }
    }

    public Patient getPatientById(Long id) {
        try {
            return patientRepository.findById(id).orElse(null);
        } catch (Exception e) {
            logger.error("Error fetching patient with id {}", id, e);
            return null;
        }
    }

    public Patient createPatient(Patient patient) {
        try {
            return patientRepository.save(patient);
        } catch (Exception e) {
            logger.error("Error creating patient", e);
            return null;
        }
    }

    public void deletePatient(Long id) {
        try {
            patientRepository.deleteById(id);
        } catch (Exception e) {
            logger.error("Error deleting patient with id {}", id, e);
        }
    }

    public Patient updatePatient(Long id, Patient patient) {
        try {
            Optional<Patient> existingPatient = patientRepository.findById(id);

            if (existingPatient.isPresent()) {
                Patient p = existingPatient.get();
                p.setName(patient.getName());
                p.setAge(patient.getAge());
                p.setGender(patient.getGender());
                return patientRepository.save(p);
            }
            return null;
        } catch (Exception e) {
            logger.error("Error updating patient with id {}", id, e);
            return null;
        }
    }
}
