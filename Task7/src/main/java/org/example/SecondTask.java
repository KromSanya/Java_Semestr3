package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SecondTask {
    public static void writeCharsInFileWithSpaces(List<Character> characterList, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Character c : characterList) writer.write(c);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка записи в файл");
        }
    }

    public static ArrayList<Character> readCharsFromFile(String filename) {
        try (FileReader reader = new FileReader(filename)) {
            ArrayList<Character> listChar = new ArrayList<>();
            while (reader.ready()) listChar.add((char) reader.read());

            return listChar;
        } catch (IOException e) {
            throw new RuntimeException("Ошибка чтения из файла");
        }
    }
}
