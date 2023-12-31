package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FirstTask {
    public static void writeIntListToBinFile(List<Integer> integerList, String filename) {
        try (DataOutputStream ds = new DataOutputStream(new FileOutputStream(filename))) {
            ds.writeInt(integerList.size());
            for (Integer integer : integerList) ds.writeInt(integer);
        } catch (IOException exception) {
            throw new RuntimeException("Ошибка записи в файл");
        }
    }

    public static List<Integer> readIntegersFromBinFile(String filename) {
        try (DataInputStream ds = new DataInputStream(new FileInputStream(filename))) {
            ArrayList<Integer> listInt = new ArrayList<>();
            int size = ds.readInt();

            for (int i = 0; i < size; i++) listInt.add(ds.readInt());

            return listInt;
        } catch (IOException e) {
            throw new RuntimeException("Ошибка чтения из файла");
        }
    }
}
