package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CompareJSONTest {

    @Test
    void compareJSON() {
        LocalDate localDate = LocalDate.of(1980, 10, 23);
        LocalDate localDate2 = LocalDate.of(2000, 10, 23);
        Person person = new Person("Jon", "Snow", "Targ", localDate);
        Person personcopy = new Person("Jon", "Snow", "Targ", localDate);
        Person person1 = new Person("Nate", "Higger", "Targ", localDate);
        String json;
        String json1;
        String jsoncopy;
        try {
            ObjectMapper mapper = new ObjectMapper();
             json = mapper.writeValueAsString(person);
             json1 = mapper.writeValueAsString(person1);
            jsoncopy = mapper.writeValueAsString(personcopy);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        assertFalse(CompareJSON.compareJSON(json, json1));
        assertTrue(CompareJSON.compareJSON(json, jsoncopy));
    }
}