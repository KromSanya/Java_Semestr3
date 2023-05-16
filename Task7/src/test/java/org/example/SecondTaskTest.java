package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class SecondTaskTest {
    @Test
    void writeAndReadCharsInFileWithSpaces() {
        var filename = "input.txt";
        ArrayList<Character> data = new ArrayList<>() {{
            add('a');
            add('b');
            add('c');
            add('d');
        }};

        SecondTask.writeCharsInFileWithSpaces(data, filename);

        Assertions.assertEquals(data, SecondTask.readCharsFromFile(filename));
    }

}