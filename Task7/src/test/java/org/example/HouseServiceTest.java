package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HouseServiceTest {

    @Test
    void serializeAndDeserializeHouse() {
        var filename = "house.data";
        LocalDate localDate = LocalDate.of(1980, 10, 23);
        Person person = new Person("Jon", "Snow", "Targ", localDate);
        Person person1 = new Person("Nate", "Higger", "Targ", localDate);
        Person person2 = new Person("Nill", "Higger", "Targ", localDate);
        Person person3 = new Person("Nuck", "Figger", "Targ", localDate);
        ArrayList<Person> persons = new ArrayList<>();
        // persons.add(person);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        Flat flat  = new Flat(20, 50.0, persons);
        List<Flat> flats = new ArrayList<>();
        flats.add(flat);
        House house = new House("12345", "some_adr", person, flats);

        HouseService.serializeHouse(house, filename);
        assertEquals(house, HouseService.deserializeHouse(filename));
    }
}