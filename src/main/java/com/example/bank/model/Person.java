package com.example.bank.model;

import com.example.bank.domain.EBank;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Person {
    @JsonProperty
    private int personId;
    @JsonProperty
    private String personName;
    @JsonProperty
    private EBank bank;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public EBank getBank() {
        return bank;
    }

    public void setBank(EBank bank) {
        this.bank = bank;
    }
}
