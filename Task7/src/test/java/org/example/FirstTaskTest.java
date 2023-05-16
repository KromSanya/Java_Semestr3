package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class FirstTaskTest {
    @Test
    void writeAndReadIntListToBinFile() {
        String filename = "integers.bin";
        ArrayList<Integer> data = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
        }};

        FirstTask.writeIntListToBinFile(data, filename);

        Assertions.assertEquals(data, FirstTask.readIntegersFromBinFile(filename));
    }

}