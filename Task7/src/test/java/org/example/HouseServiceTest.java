package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HouseServiceTest {

    @Test
    void serializeAndDeserializeHouse() {
        var filename = "house.data";
        var house = new House("1", "some_adr", new Person("name", "l_name", "p", LocalDate.now()), new ArrayList<>());

        HouseService.serializeHouse(house, filename);
        assertEquals(house, HouseService.deserializeHouse(filename));
    }
}