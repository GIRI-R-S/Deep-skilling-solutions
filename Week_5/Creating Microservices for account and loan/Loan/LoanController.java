package com.cognizant.loan.controller;

import com.cognizant.loan.model.Loan;
import com.cognizant.loan.service.LoanService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping("/{number}")
    public Loan getLoan(@PathVariable String number) {
        return loanService.getLoanByNumber(number);
    }
}
