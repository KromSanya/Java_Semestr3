package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class NameFilterTest {

    @Test
    void fileNameFilter() {
        Pattern pattern = Pattern.compile("А.+?а");
        ArrayList<String> txtData = new ArrayList<>() {{
            add("C:\\Users\\kromv\\IdeaProjects\\Task7\\src\\main\\java\\org\\example\\Анализ.txt");
            add("C:\\Users\\kromv\\IdeaProjects\\Task7\\src\\main\\java\\org\\example\\Новая папка\\Анальгин.txt");
        }};
        assertEquals(txtData, NameFilter.fileNameFilter("C:\\Users\\kromv\\IdeaProjects\\Task7\\src\\main\\java\\org\\example", pattern));
    }
}