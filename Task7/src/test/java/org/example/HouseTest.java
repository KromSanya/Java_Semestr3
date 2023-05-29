package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


import static org.junit.jupiter.api.Assertions.assertEquals;


class HouseTest {

    @Test
    void serializeAndDeserializeHouse() throws JsonProcessingException {
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
        String json= House.serialize(house);
        House house2 = House.deserialize(json);
        assertEquals(house, house2);
    }

    @Test
    void exportCSV() throws IOException {
        LocalDate localDate = LocalDate.of(1980, 10, 23);
        Person person = new Person("Jon", "Snow", "Targ", localDate);
        Person person1 = new Person("Nate", "Higger", "Targ", localDate);
        Person person2 = new Person("Nill", "Higger", "Targ", localDate);
        Person person3 = new Person("Nuck", "Figger", "Targ", localDate);
        Person person4 = new Person("First", "Person", "p",
                LocalDate.of(2000, Month.JANUARY, 15));
        Person person5 = new Person("Second", "Person", "p",
                LocalDate.of(2000, Month.JUNE, 15));
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(person);
        persons.add(person1);
        ArrayList<Person> persons2 = new ArrayList<Person>();
        persons.add(person2);
        persons.add(person3);
        Flat flat = new Flat(1, 20, persons);
        Flat flat1 = new Flat(2, 30, persons);
        ArrayList<Flat> flats = new ArrayList<>();
        flats.add(flat);
        flats.add(flat1);
        House house = new House("12345", "some_adr", person4, flats);
        house.exportCSV();
        File file = new File("house_12345.csv");
        Path path = Paths.get("house_12345.csv");
        BufferedReader br = new BufferedReader(new FileReader("house_12345.csv"));
        ArrayList<String> stringArrayList = (ArrayList<String>) Files.readAllLines(path);
        StringBuilder str= new StringBuilder();

        for (String s : stringArrayList) {
            str.append(s).append("\n");
        }

        assertEquals("""
                Кадастровый номер: ;12345;
                Адрес: ;some_adr
                Старший по дому: ;Person First p 2000-01-15;
                ;Данные о квартирах;
                Номер; Площадь; Владельцы
                1;20.0;[Snow Jon Targ 1980-10-23, Higger Nate Targ 1980-10-23, Higger Nill Targ 1980-10-23, Figger Nuck Targ 1980-10-23]
                2;30.0;[Snow Jon Targ 1980-10-23, Higger Nate Targ 1980-10-23, Higger Nill Targ 1980-10-23, Figger Nuck Targ 1980-10-23]
                                                                                                                                                                                                                                                                                                
                """, String.valueOf(str));
    }
}