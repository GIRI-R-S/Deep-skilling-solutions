package com.cognizant.account.service;

import org.springframework.stereotype.Service;
import com.cognizant.account.model.Account;

@Service
public class AccountService {

    public Account getAccountByNumber(String number) {
      
        return new Account(number, "savings", 200000);
    }
}
