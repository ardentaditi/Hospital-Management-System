package com.HMS.HospitalManagementSystem.service;

import com.HMS.HospitalManagementSystem.models.Bill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    public List<Bill> getAllBills() {
        try {
            System.out.println("into Bill service layer");
            return null;
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public Bill getBillById(Long id) {
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public Bill createBill(Bill bill) {
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }

    public void deleteBill(Long id) {
        try {
            // delete logic
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
        }
    }

    public Bill updateBill(Long id) {
        try {
            return null;
        } catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
            return null;
        }
    }
}
