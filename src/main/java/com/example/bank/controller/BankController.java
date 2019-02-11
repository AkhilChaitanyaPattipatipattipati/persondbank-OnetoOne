package com.example.bank.controller;

import com.example.bank.model.Bank;
import com.example.bank.service.BankServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/bankdetails")
public class BankController {
    @Autowired
    private BankServiceImpl bankService;

    @PostMapping(path = "/bankinfo/save/",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Bank saveDepartment(@RequestBody Bank bank) {

        return bankService.save(bank);
    }
}
