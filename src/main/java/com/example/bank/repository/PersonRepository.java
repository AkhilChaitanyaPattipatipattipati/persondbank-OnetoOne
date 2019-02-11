package com.example.bank.repository;

import com.example.bank.domain.EPerson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<EPerson,Integer> {  // question what we have to keep in tjat  2 nd parameter
}
