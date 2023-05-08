package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

import static org.example.ExportCSV.exportSCV;

public class Main {
    public static void main(String[] args) {
        int n;
        int[] arrInt = {1, 3, 5, 0, 7, 6};
        int[] arr2 = new int[6];
        FileOutputStream fs = null;
        Reader reader = null;
        Writer writer = null;
        /*
        try {
            fs = new FileOutputStream("int.bin");
            FileInputStream fs2 = new FileInputStream("int.bin");
            DataOutputStream ds = new DataOutputStream(fs);
            DataInputStream ds2 = new DataInputStream(fs2);
            for (int j : arrInt) {
                ds.writeInt(j);
            }
            for(int i =0; i < arrInt.length; i++)
            {
              arr2[i] = ds2.readInt();
              System.out.println(arr2[i]);
            }


            writer = new FileWriter("test.txt");
            for (int j : arrInt) {
                writer.write(j + "");
            }
            writer.close();
            reader = new FileReader("test.txt");
            for(int i = 0; i < arrInt.length; i++) {
                arr2[i] = reader.read();
                System.out.println(arr2[i]- '0');
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        FileAccess fileAccess = new FileAccess();
        fileAccess.getArr(4);

        ExtensionFilter filter = new ExtensionFilter(".java");
        filter.fileExtensionFilter("C:\\Users\\kromv\\IdeaProjects\\Task7\\src\\main\\java\\org\\example");


        Pattern pattern = Pattern.compile("А.+?а");
        NameFilter nameFilter = new NameFilter();
        nameFilter.fileNameFilter("C:\\Users\\kromv\\IdeaProjects\\Task7\\src\\main\\java\\org\\example", pattern);

        var house = new House("12345", "some_adr", new Person("name", "l_name", "p", new Date(1970, Calendar.FEBRUARY, 15)), new ArrayList<Flat>());
        exportSCV(house);


    }
}
