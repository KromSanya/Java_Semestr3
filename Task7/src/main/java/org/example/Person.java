package org.example;



import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
@JsonSerialize(using = PersonSerializer.class)
@JsonDeserialize(using = PersonDeserializer.class)
public class Person implements Serializable{
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate date;

    public Person()
    {

    }

    @JsonCreator
    public Person(@JsonProperty(value = "name") String firstName, @JsonProperty(value = "lastName") String lastName, @JsonProperty(value = "patronymic") String patronymic, @JsonProperty(value = "date") LocalDate date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.date = date;
    }


    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(patronymic, person.patronymic) && Objects.equals(date, person.date);
    }
    @Override public int hashCode() {
        return Objects.hash(firstName, lastName, patronymic, date);
    }
    @Override public String toString() {
        return lastName + " " + firstName + " " + patronymic + " " + date.toString();
//                "Person{" +
//                "name='" + name + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", patronymic='" + patronymic + '\'' +
//                ", date=" + date +
//                '}';
    }
}