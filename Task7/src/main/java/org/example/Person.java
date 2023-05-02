package org.example;


import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Person implements Serializable {
    private String name;
    private String lastName;
    private String patronymic;

    private Date date;


    public Person(String name, String lastName, String patronymic, Date date) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName) && Objects.equals(patronymic, person.patronymic) && Objects.equals(date, person.date);
    }
    @Override public int hashCode() {
        return Objects.hash(name, lastName, patronymic, date);
    }
    @Override public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", date=" + date +
                '}';
    }
}