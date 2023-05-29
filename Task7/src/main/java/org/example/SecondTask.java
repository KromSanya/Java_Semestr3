package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecondTask {
    public static void writeCharsInFileWithSpaces(int[] a, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (int i = 0; i < a.length; i++)
                writer.write(a[i] + " ");
        } catch (IOException e) {
            throw new RuntimeException("Ошибка записи в файл");
        }
    }

    public static int[] readCharsFromFile(String filename, int[] a) {
        try (Scanner scan = new Scanner(new FileInputStream(filename))) {
//            DataInputStream dis = new DataInputStream(new FileInputStream(filename));
//            for(int i = 0; i < a.length; i++)
//                a[i] = dis.readInt();
            int i = 0;
            while (scan.hasNext() || i < a.length) {
                a[i] = scan.nextInt();
                i++;
            }
            return a;
        } catch (IOException e) {
            throw new RuntimeException("Ошибка чтения из файла");
        }
    }
}