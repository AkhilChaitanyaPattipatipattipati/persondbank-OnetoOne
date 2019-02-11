package com.example.bank.service;

import com.example.bank.domain.EBank;
import com.example.bank.model.Bank;
import com.example.bank.repository.BankRepository;
import com.example.bank.util.MapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService {


    @Autowired
    private BankRepository bankRepository;

    @Override
    public Bank save(Bank bank) {
        EBank eBank = mapToEBank(bank);
        bankRepository.save ( eBank );
        return bank;

    }

    private EBank mapToEBank(Bank bank) {
        EBank eBank=new EBank ();
        eBank.setAccountNumber ( bank.getAccountNumber () );
        eBank.setBalance ( bank.getBalance () );
        eBank.setBankId ( bank.getBankId () );
        return eBank;
    }
}
