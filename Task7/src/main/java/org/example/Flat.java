package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@JsonSerialize(using = FlatSerializer.class)
@JsonDeserialize(using = FlatDeserializer.class)
public class Flat implements Serializable {
    private int number;
    private double square;
    private List<Person> personList;

    public Flat()
    {

    }

    public Flat(@JsonProperty(value = "number") int number, @JsonProperty(value = "square") double square, @JsonProperty(value = "name") List<Person> personList) {
        setNumber(number);
        setSquare(square);
        setPersonList(personList);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flat flat = (Flat) o;
        return number == flat.number && Double.compare(flat.square, square) == 0 && Objects.equals(personList, flat.personList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, square, personList);
    }

    @Override
    public String toString() {
        return "Flat{" +
                "number=" + number +
                ", square=" + square +
                ", personList=" + personList +
                '}';
    }
}