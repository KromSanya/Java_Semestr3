package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class SecondTaskTest {
    @Test
    void writeAndReadCharsInFileWithSpaces() {
        var filename = "input.txt";
        int[] data = new int[3];
        data[0] = 0;
        data[1] = 2_000_000_000;
        data[2] = 2000;
        int[] data2 = new int[3];

        SecondTask.writeCharsInFileWithSpaces(data, filename);
        SecondTask.readCharsFromFile(filename, data2);
        for(int i = 0; i < data2.length; i++)
        {
            Assertions.assertEquals(data[i], data2[i]);
        }
    }

}