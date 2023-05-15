package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExtensionFilterTest {

    @Test
    void getFilesFromDirWithType() { // Тест привязан к файловой системе
        List<String> pngPathList = ExtensionFilter.fileExtensionFilter("C:\\Users\\kromv\\IdeaProjects\\Task7\\src\\main\\java\\org\\example","png");
        List<String> txtPathList = ExtensionFilter.fileExtensionFilter("C:\\Users\\kromv\\IdeaProjects\\Task7\\src\\main\\java\\org\\example","txt");

        ArrayList<String> txtData = new ArrayList<>() {{
            add("Анализ.txt");
            add("пуп.txt");
        }};

        assertTrue(pngPathList.isEmpty());
        assertEquals(txtData, txtPathList.stream().toList());
    }

}