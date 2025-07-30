package com.cognizant.loan.service;

import com.cognizant.loan.model.Loan;
import org.springframework.stereotype.Service;

@Service
public class LoanService {
    public Loan getLoanByNumber(String number) {
        return new Loan(number, "car", 400000, 3258, 18);
    }
}
