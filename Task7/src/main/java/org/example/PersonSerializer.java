package org.example;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class PersonSerializer extends StdSerializer<Person> {


    public PersonSerializer() {
        super(Person.class);
    }
    @Override
    public void serialize(
                    Person person,
                    JsonGenerator jGen,
                    SerializerProvider serializerProvider) throws IOException
    {
        jGen.writeStartObject();
        jGen.writeStringField("FullName", person.getLastName() + " " + person.getFirstName() + " " + person.getPatronymic());
        jGen.writeStringField("Дата рождения", person.getDate().toString());
        jGen.writeEndObject();
    }
}
