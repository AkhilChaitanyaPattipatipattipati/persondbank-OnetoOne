package com.example.bank.service;

import com.example.bank.controller.PersnController;
import com.example.bank.domain.EBank;
import com.example.bank.domain.EPerson;
import com.example.bank.model.Person;
import com.example.bank.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person save(Person person) {
        EPerson ePerson = mapToEPerson ( person );
        ePerson = personRepository.save ( ePerson );
        return person;
    }

    private EPerson mapToEPerson(Person person) {
        EBank eBank = new EBank ();
        eBank.setAccountNumber ( person.getBank ().getAccountNumber () );
        eBank.setBalance ( person.getBank ().getBalance () );
        eBank.setBankId ( person.getBank ().getBankId () );

        EPerson ePerson = new EPerson ();
        ePerson.setPersonId ( person.getPersonId () );
        ePerson.setPersonName ( person.getPersonName () );
        ePerson.setBank ( eBank );

        return ePerson;
    }

}
