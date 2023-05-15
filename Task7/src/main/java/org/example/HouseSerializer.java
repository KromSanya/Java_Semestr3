package org.example;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class HouseSerializer extends StdSerializer<House> {
    protected HouseSerializer() {
        super(House.class);
    }

    @Override
    public void serialize(House house, JsonGenerator jGen, SerializerProvider serializerProvider) throws IOException
    {
        jGen.writeStartObject();
        jGen.writeStringField("House Number", house.getHouseNumber());
        jGen.writeStringField("House Address", house.getAddress());
        jGen.writeStringField("FullName", house.getMainPerson().getLastName() + " " + house.getMainPerson().getFirstName() + " " + house.getMainPerson().getPatronymic());
        jGen.writeStringField("Дата рождения", house.getMainPerson().getDate().toString());
        jGen.writeFieldName("flats");
        jGen.writeStartArray();
        for(Flat flat : house.getFlatList())
        {
            ObjectMapper mapper = new ObjectMapper();
            // mapper.writeValueAsString(flat.getPersonList());
            jGen.writeRawValue(mapper.writeValueAsString(flat));
        }
        jGen.writeEndArray();
        jGen.writeEndObject();
    }
}

