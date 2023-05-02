package org.example;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class House implements Serializable {
    private String houseNumber;
    private String address;
    private Person mainPerson;
    private List<Flat> flatList;

    public House(String houseNumber, String address, Person mainPerson, List<Flat> flatList) {
        this.houseNumber = houseNumber;
        this.address = address;
        this.mainPerson = mainPerson;
        this.flatList = flatList;
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