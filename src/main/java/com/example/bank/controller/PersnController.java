package com.example.bank.controller;

import com.example.bank.model.Person;
import com.example.bank.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/persondetails")
public class PersnController {

    @Autowired
    private PersonServiceImpl personService;

    @RequestMapping(path = "/save",produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
    public @ResponseBody
    Person saveProduct(@RequestBody Person person){
        return  personService.save(person);
    }

}
