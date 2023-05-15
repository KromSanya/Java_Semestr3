package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FlatSerializerTest {

    @Test
    void serializeAndDeserializeFlat() {
        LocalDate localDate = LocalDate.of(1980, 10, 23);
        Person person = new Person("Jon", "Snow", "Targ", localDate);
        Person person1 = new Person("Nate", "Higger", "Targ", localDate);
        Person person2 = new Person("Nill", "Higger", "Targ", localDate);
        Person person3 = new Person("Nuck", "Figger", "Targ", localDate);
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        Flat flat  = new Flat(20, 50.0, persons);
        Flat flat2 = flat;
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(flat);

            flat = mapper.readValue(json, Flat.class);
            assertEquals(flat2, flat = mapper.readValue(json, Flat.class));


        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

}