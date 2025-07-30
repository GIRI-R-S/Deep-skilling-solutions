package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.*;

import com.cognizant.account.model.Account;
import com.cognizant.account.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{number}")
    public Account getAccount(@PathVariable String number) {
        return accountService.getAccountByNumber(number);
    }
}
