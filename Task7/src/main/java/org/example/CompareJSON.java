package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class CompareJSON {

    public static boolean compareJSON(String jsonString1, String jsonString2){
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode tree1 = mapper.readTree(jsonString1);
            JsonNode tree2 = mapper.readTree(jsonString2);

            return tree1.equals(tree2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
