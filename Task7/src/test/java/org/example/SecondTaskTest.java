package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SecondTaskTest {
    @Test
    void writeAndReadCharsInFileWithSpaces() {
        var filename = "input.txt";
        var data = new ArrayList<Character>() {{
            add('a');
            add('b');
            add('c');
            add('d');
        }};

        SecondTask.writeCharsInFileWithSpaces(data, filename);

        Assertions.assertEquals(data, SecondTask.readCharsFromFile(filename));
    }

}