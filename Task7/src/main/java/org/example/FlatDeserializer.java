package org.example;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
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
        jp.nextValue();
        while (jp.nextValue() != JsonToken.END_ARRAY) {
            ObjectMapper objectMapper = new ObjectMapper();
            personList.add( objectMapper.readValue(jp, new TypeReference<>(){}));
            jp.nextValue();
        }

        return new Flat(number, square, personList);
    }
}
