package com.example.bank.repository;

import com.example.bank.domain.EBank;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends CrudRepository<EBank,Integer> {
}
