package org.example;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class FlatSerializer extends StdSerializer<Flat> {
    protected FlatSerializer() {
        super(Flat.class);
    }

    @Override
    public void serialize(Flat flat, JsonGenerator jGen, SerializerProvider serializerProvider) throws IOException {
        {
            jGen.writeStartObject();
            jGen.writeNumberField("Number", flat.getNumber());
            jGen.writeNumberField("Square", flat.getSquare());
            jGen.writeFieldName("persons");
            jGen.writeStartArray();
            for (Person person: flat.getPersonList()) {
                ObjectMapper mapper = new ObjectMapper();
               // mapper.writeValueAsString(flat.getPersonList());
                jGen.writeRawValue(mapper.writeValueAsString(person));
            }
            jGen.writeEndArray();
            jGen.writeEndObject();
        }

    }
}
