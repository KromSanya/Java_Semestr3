package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static org.example.ExportCSV.exportSCV;
import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @Test
    void exportCSV() {
        Person person = new Person("First", "Person", "p",
                LocalDate.of(2000, Month.JANUARY, 15));
        Person person1 = new Person("Second", "Person", "p",
                LocalDate.of(2000, Month.JUNE, 15));
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(person);
        persons.add(person1);
        Flat flat = new Flat(1, 20, persons);
        Flat flat1 = new Flat(2, 30, persons);
        ArrayList<Flat> flats = new ArrayList<>();
        flats.add(flat);
        flats.add(flat1);
        var house = new House("12345", "some_adr", new Person("name", "l_name", "p",
                 LocalDate.of(1971, Month.MAY, 15)), flats);
        house.exportCSV();
    }
}