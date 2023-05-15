package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonSerializerTest {

    @Test
    void serializeAndDeserializePerson() {
        try {
            LocalDate localDate = LocalDate.of(1980, 10, 23);
            Person person = new Person("Jon", "Snow", "Targ", localDate);
            Person person2 = new Person("Jon", "Snow", "Targ", localDate);
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(person);

            assertEquals(person2, person = mapper.readValue(json, Person.class));

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}