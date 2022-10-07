package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class CreatePerson {

    @Autowired
    PersonBuilder personBuilder;

    public Person create (){
        int id = 23;
        String name = "John";
        Person person = null;
        return personBuilder.build(id, name);
    }


}

class CreatePersonTest {

    @Autowired
    CreatePerson createPerson;

    Person person = createPerson.create();

}
