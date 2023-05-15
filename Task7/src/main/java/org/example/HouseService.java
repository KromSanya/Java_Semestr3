package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class HouseService {
    public static void serializeHouse(House house, String filename) {
        try (ObjectOutput out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filename)))) {
            out.writeObject(house);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка сериализации");
        }
    }
//    public static void serializeStreamingHouse(House house, String filename)
//    {
//        try {
//            Writer writer = new FileWriter(filename, StandardCharsets.UTF_8);
//            ObjectMapper mapper= new ObjectMapper();
//            mapper.writeValueAsString(writer, house);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public static House deserializeStreamingHouse(String filename)
//    {
//        try {
//            Reader reader = new FileReader(filename , StandardCharsets.UTF_8);
//            ObjectMapper mapper = new ObjectMapper();
//            House house = mapper.readValue(reader, House.class);
//            return house;
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static House deserializeHouse(String filename) {
        try (ObjectInput in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename)))) {
            return (House) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Ошибка десериализации");
        }
    }
}
