package org.example;

import java.io.*;
import java.util.stream.IntStream;

public class ExportCSV {
    private static final String CSV_SEPARATOR = ";";

    public static void exportSCV(House house)
    {
        String filename = "house_" + house.getHouseNumber() + ".csv";
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename)));
            StringBuilder oneLine = new StringBuilder();
            oneLine.append("Кадастровый номер: ").append(CSV_SEPARATOR).append(house.getHouseNumber()).append(CSV_SEPARATOR).append("\r\n");
            oneLine.append("Адрес: ").append(CSV_SEPARATOR).append(house.getAddress()).append("\r\n");
            oneLine.append("Старший по дому: ").append(CSV_SEPARATOR).append(house.getMainPerson().toString()).append(CSV_SEPARATOR).append("\r\n");
            oneLine.append(CSV_SEPARATOR).append("Данные о квартирах").append(CSV_SEPARATOR).append("\r\n");
            oneLine.append("Номер; Площадь; Владельцы").append("\r\n");
            IntStream.range(0, house.getFlatList().size()).forEach(i -> {
                oneLine.append(house.getFlatList().get(i).getNumber());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(house.getFlatList().get(i).getSquare());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(house.getFlatList().get(i).getPersonList().toString());
                oneLine.append("\r\n");
            });
            bw.write(oneLine.toString());
            bw.newLine();

            bw.flush();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
