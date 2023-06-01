package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ReflectionDemoTest {
    @Test
    void findNumHuman() {
        var data = new ArrayList<>() {{
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
        Assertions.assertEquals(5, ReflectionDemo.findNumHuman(data));

        data.clear();
        Assertions.assertEquals(0, ReflectionDemo.findNumHuman(data));
    }

    @Test
    void getOpenMethods() {
        Assertions.assertEquals(15, ReflectionDemo.getOpenMethods(new Human("", "", "", 0)).size());
        //System.out.println(ReflectionDemo.getOpenMethods(new Human("", "", "", 0)));
        Assertions.assertEquals(4, ReflectionDemo.getOpenMethods(new Student("", "", "", 1, "")).size());
//        Assertions.assertEquals(90, ReflectionDemo.getOpenMethods("").size());
//        Assertions.assertEquals(61, ReflectionDemo.getOpenMethods(1).size());
    }

    @Test
    void getSuperClasses() {
        var classesForHuman = new ArrayList<String>() {{
            add("org.example.Human");
            add("java.lang.Object");
        }};

        var classesForStudent = new ArrayList<String>() {{
            add("org.example.Student");
            add("org.example.Human");
            add("java.lang.Object");
        }};

        Assertions.assertEquals(classesForHuman, ReflectionDemo.getNameSuperClasses(new Human("", "", "", 0)));
        Assertions.assertEquals(classesForStudent, ReflectionDemo.getNameSuperClasses(new Student("", "", "", 1, "")));
    }
}