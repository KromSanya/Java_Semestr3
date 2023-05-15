package org.example;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class PersonDeserializer extends StdDeserializer<Person> {

    public PersonDeserializer() {
        super(Person.class);
    }

    @Override
    public Person deserialize(
            JsonParser jp,
            DeserializationContext context) throws IOException, JsonProcessingException {
        String fullname = "";
        String[] Fullname;
        LocalDate localDate;
        jp.nextValue();
        fullname = jp.getValueAsString();
        Fullname = fullname.split(" ");
        String lastName = Fullname[0];
        String firstName = Fullname[1];
        String patronymic = Fullname[2];
        jp.nextValue();
        localDate = LocalDate.parse(jp.getValueAsString());
        return new Person(lastName, firstName, patronymic, localDate);
    }
}
