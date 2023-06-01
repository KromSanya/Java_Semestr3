package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void numFindElem() {
        ArrayList<?> data = new ArrayList<>() {{
            add(new Human("", "", "", 0)); //21
            add(666);
            add("some_text");
            add(new Student("", "", "", 1, "")); //23
            add(new Object());
            add(new Date());
        }};

        Assertions.assertEquals(2, Task4.numFindElem(data));
        System.out.println(Task4.numFindElem(data));
    }
}