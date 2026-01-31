package com.HMS.HospitalManagementSystem.controllers;

import com.HMS.HospitalManagementSystem.models.Bill;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bills") // ROUTE
public class BillController {

    @GetMapping
    public List<Bill> getAllBills() {
        System.out.println("Fetching all bills");
        return null;
    }

    @PostMapping
    public Bill createBill(@RequestBody Bill bill) {
        System.out.println("Creating bill");
        return bill;
    }

    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id) {
        System.out.println("Fetching bill by ID");
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id) {
        System.out.println("Deleting bill with ID: " + id);
    }

    @PutMapping("/{id}")
    public void updateBill(@PathVariable Long id) {
        System.out.println("Updating bill with ID: " + id);
    }
}
