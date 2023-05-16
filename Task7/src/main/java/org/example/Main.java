package org.example;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
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

        ExtensionFilter filter = new ExtensionFilter(".java");
        //filter.fileExtensionFilter("C:\\Users\\kromv\\IdeaProjects\\Task7\\src\\main\\java\\org\\example");


        Pattern pattern = Pattern.compile("А.+?а");
        NameFilter nameFilter = new NameFilter();
        nameFilter.fileNameFilter("C:\\Users\\kromv\\IdeaProjects\\Task7\\src\\main\\java\\org\\example", pattern);
        LocalDate localDate = LocalDate.of(1980, 10, 23);
        Person person = new Person("Jon", "Snow", "Targ", localDate);
        Person person1 = new Person("Nate", "Higger", "Targ", localDate);
        Person person2 = new Person("Nill", "Higger", "Targ", localDate);
        Person person3 = new Person("Nuck", "Figger", "Targ", localDate);
        ArrayList<Person> persons = new ArrayList<>();
       // persons.add(person);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        Flat flat  = new Flat(20, 50.0, persons);
        List<Flat> flats = new ArrayList<>();
        flats.add(flat);
        House house = new House("12345", "some_adr", person, flats);
        //System.out.println(flat.toString());
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(house);

            house = mapper.readValue(json, House.class);
            System.out.println(json);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

