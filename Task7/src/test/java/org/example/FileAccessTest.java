package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class FileAccessTest {
    @Test
    void getArr() {
        var filename = "test.bin";
        ArrayList<Integer> data = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
        }};

        FirstTask.writeIntListToBinFile(data, filename);
        Assertions.assertEquals(data, FileAccess.getArr(filename, 0));

        data.remove(0);
        Assertions.assertEquals(data, FileAccess.getArr(filename, 1));

        data.remove(0);
        Assertions.assertEquals(data, FileAccess.getArr(filename, 2));
    }

}