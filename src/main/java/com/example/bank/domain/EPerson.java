package com.example.bank.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "person")
public class EPerson implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //need to ask why is this used
    @Column(name="person_id")
    private Integer personId;
    @Column(name="person_name")
    private String personName;

    @OneToOne(targetEntity = EBank.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    //cascade is used for when we try to save or update or fetch person with bank details we have to use this Cascade.all
    // or if we want to have only perticular operation means when we want to fetch person with bank we will have cascade.PERSIST
    @JoinColumn(name = "bankIdFk",referencedColumnName = "bank_id")
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
