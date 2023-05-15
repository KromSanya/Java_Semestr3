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

public class HouseDeserializer extends StdDeserializer<House> {
    protected HouseDeserializer() {
        super(House.class);
    }

    @Override
    public House deserialize(JsonParser jp, DeserializationContext deserializationContext) throws IOException, JacksonException
    {
         String houseNumber;
         String address;
         Person mainPerson;
         List<Flat> flatList = new ArrayList<>();
        jp.nextValue();
        houseNumber = jp.getValueAsString();
        jp.nextValue();
        address = jp.getValueAsString();

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
        mainPerson = new Person(firstName, lastName, patronymic, localDate);
        jp.nextValue();
        while (jp.nextValue() != JsonToken.END_ARRAY) {
            ObjectMapper objectMapper = new ObjectMapper();
            flatList.add( objectMapper.readValue(jp, new TypeReference<>(){}));
            jp.nextValue();
        }


        return new House(houseNumber, address, mainPerson, flatList);
    }
}
