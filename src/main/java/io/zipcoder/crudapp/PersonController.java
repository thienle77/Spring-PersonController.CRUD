package io.zipcoder.crudapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/people")
public class PersonController {
    @Autowired
    PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }










}
