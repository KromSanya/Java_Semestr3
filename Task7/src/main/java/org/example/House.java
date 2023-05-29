package org.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

@JsonSerialize(using = HouseSerializer.class)
@JsonDeserialize(using = HouseDeserializer.class)
public class House implements Serializable {
    private String houseNumber;
    private String address;
    private Person mainPerson;
    private List<Flat> flatList;

    public House()
    {

    }

    @JsonCreator
    public House(@JsonProperty(value = "houseNumber") String houseNumber, @JsonProperty(value = "address") String address, @JsonProperty(value = "mainPerson") Person mainPerson, @JsonProperty(value = "flatList") List<Flat> flatList) {
        setHouseNumber(houseNumber);
        setAddress(address);
        setMainPerson(mainPerson);
        setFlatList(flatList);
    }

    public void exportCSV()
    {
        String filename = "house_" + houseNumber + ".csv";
        String CSV_SEPARATOR = ";";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename, StandardCharsets.UTF_8));
            StringBuilder oneLine = new StringBuilder();
            oneLine.append("Кадастровый номер: ").append(CSV_SEPARATOR).append(houseNumber).append(CSV_SEPARATOR).append("\r\n");
            oneLine.append("Адрес: ").append(CSV_SEPARATOR).append(address).append("\r\n");
            oneLine.append("Старший по дому: ").append(CSV_SEPARATOR).append(mainPerson.toString()).append(CSV_SEPARATOR).append("\r\n");
            oneLine.append(CSV_SEPARATOR).append("Данные о квартирах").append(CSV_SEPARATOR).append("\r\n");
            oneLine.append("Номер; Площадь; Владельцы").append("\r\n");
            IntStream.range(0, flatList.size()).forEach(i -> {
                oneLine.append(flatList.get(i).getNumber());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(flatList.get(i).getSquare());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(flatList.get(i).getPersonList());
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

    public static House deserialize(String json) {
        try {
            return new ObjectMapper().readValue(json, House.class);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка десериализации");
        }
    }

    public static String serialize(House house) {
        try {
            return new ObjectMapper().writeValueAsString(house);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка сериализации");
        }
    }



    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person getMainPerson() {
        return mainPerson;
    }

    public void setMainPerson(Person mainPerson) {
        this.mainPerson = mainPerson;
    }

    public List<Flat> getFlatList() {
        return flatList;
    }

    public void setFlatList(List<Flat> flatList) {
        this.flatList = flatList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(houseNumber, house.houseNumber) && Objects.equals(address, house.address) && Objects.equals(mainPerson, house.mainPerson) && Objects.equals(flatList, house.flatList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(houseNumber, address, mainPerson, flatList);
    }

    @Override
    public String toString() {
        return "House{" +
                "houseNumber='" + houseNumber + '\'' +
                ", address='" + address + '\'' +
                ", mainPerson=" + mainPerson +
                ", flatList=" + flatList +
                '}';
    }
}