package com.example.bank.domain;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bank")
public class EBank implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bank_id")
    private Integer bankId;

    @Column(name = "account_number")
    private Integer accountNumber;

    @Column(name = "balance")
    private Long balance;

    @OneToOne(mappedBy = "bank")
    private EPerson person;

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public EPerson getPerson() {
        return person;
    }

    public void setPerson(EPerson person) {
        this.person = person;
    }
}
