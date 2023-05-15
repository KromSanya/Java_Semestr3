package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;


public class FileAccess {
    public static ArrayList<Integer> getArr(String path, int poz) {

        ArrayList<Integer> arr = new ArrayList<>();
        RandomAccessFile rand;
            try {
                rand = new RandomAccessFile(path, "r");
                rand.seek(4 + poz * 4L);
                while (rand.getFilePointer() < rand.length())
                {
                    arr.add(rand.readInt());
                }
                return arr;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


    }

}
