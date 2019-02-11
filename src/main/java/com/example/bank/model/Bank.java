package com.example.bank.model;

import com.example.bank.domain.EBank;
import com.example.bank.domain.EPerson;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

public class Bank {
    @JsonProperty
    private int bankId;
    @JsonProperty
    private int accountNumber;
    @JsonProperty
    private long balance;
    @JsonProperty
    private EPerson person;

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public EPerson getPerson() {
        return person;
    }

    public void setPerson(EPerson person) {
        this.person = person;
    }
}
