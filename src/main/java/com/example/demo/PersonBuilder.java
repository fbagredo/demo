package com.example.demo;

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class PersonBuilder {
        public Person build(int id, String name) {
            return new Person(id, name);
        }

}
