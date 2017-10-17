package com.codefellows;

import java.util.ArrayList;

public class WebService {
    public String serveContent() {
        return "some content";
    }

    public ArrayList<Person> getAllPeople() {
        ArrayList<Person> people = new ArrayList();
        people.add(getPerson(1));

        //add other people

        return people;
    }

    public Person getPerson(int id) {
        Person p = Person.builder()
                .age(25)
                .name("Art")
                .city("Seattle")
                .favoriteColor("Gold")
                .build();
        return p;
    }
}
