package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void numFindElem() {
        ArrayList<?> data = new ArrayList<>() {{
            add(new Human("", "", "", 0));
            add(new Human("", "", "", 0));
            add(new Human("", "", "", 0));
            add(new Human("", "", "", 0));
            add(666);
            add("some_text");
            add(new Student("", "", "", 1, ""));
            add(new Object());
            add(new Date());
        }};


        System.out.println(Task4.numFindElem(data));
    }
}