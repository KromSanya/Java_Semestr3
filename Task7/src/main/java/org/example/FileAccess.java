package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class FileAccess {
    public void getArr(long n) {

        int[] arr;
        char temp;
        RandomAccessFile rand;
            try {
                rand = new RandomAccessFile("test2.txt", "r");
                arr = new int[(int) rand.length()];
                rand.seek(n);
                for(long i = 0; i < rand.length()-n; i++)
                {
                    temp = (char) rand.read();
                    arr[(int) i] = temp - '0';
                    System.out.println(arr[(int) i]);
                }

                //System.out.println(rand.readLine());

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


    }

}
