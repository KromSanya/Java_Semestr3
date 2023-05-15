package org.example;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FlatDeserializer extends StdDeserializer<Flat> {
    protected FlatDeserializer() {
        super(Flat.class);
    }

    @Override
    public Flat deserialize(JsonParser jp, DeserializationContext deserializationContext) throws IOException, JacksonException {
         int number;
         double square;
         List<Person> personList = new ArrayList<>();
        jp.nextValue();
        number = jp.getIntValue();
        jp.nextValue();
        square = jp.getDoubleValue();
        while (jp.nextToken() != JsonToken.END_OBJECT) {
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
            personList.add(new Person(firstName, lastName, patronymic, localDate));
        }

        return new Flat(number, square, personList);
    }
}
