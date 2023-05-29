package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class NameFilterTest {

    @Test
    void fileNameFilter() {
        Pattern pattern = Pattern.compile("А.+?а");
        ArrayList<String> txtData = new ArrayList<>() {{
            add(System.getProperty("user.dir") + "\\src\\test\\resources\\Анализ.txt");
            add(System.getProperty("user.dir") + "\\src\\test\\resources\\Новая папка\\Анальгин.txt");
        }};


        assertEquals(txtData, NameFilter.fileNameFilter(System.getProperty("user.dir") +"\\src\\test/resources", pattern));
    }
}