package org.example;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
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
//        try {
//            assertEquals("Кадастровый номер: ;12345;\n" +
//                    "Адрес: ;some_adr\n" +
//                    "Старший по дому: ;l_name name p 1971-05-15;\n" +
//                    ";Данные о квартирах;\n" +
//                    "Номер; Площадь; Владельцы\n" +
//                    "1;20.0;[Snow Jon Targ 1980-10-23, Higger Nate Targ 1980-10-23, Higger Nill Targ 1980-10-23, Figger Nuck Targ 1980-10-23]\n" +
//                    "2;30.0;[Snow Jon Targ 1980-10-23, Higger Nate Targ 1980-10-23, Higger Nill Targ 1980-10-23, Figger Nuck Targ 1980-10-23]", new FileReader("house_12345.csv").);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}