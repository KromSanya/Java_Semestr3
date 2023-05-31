package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Human {

    //По множеству объектов, расширяющих Human, постройте список так, чтобы итератор
    //списка перебирал его элементы по возрастанию ФИО людей без дополнительной
    //сортировки списка.

    private String name;
    private String lastName;
    private String patronymic;

    private int age;

    public Human(String name, String lastName, String patronymic, int age) {
        setName(name);
        setLastName(lastName);
        setPatronymic(patronymic);
        setAge(age);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean hasName(){
        return this.name    != null;
    }
    public boolean hasLastname(){
        return this.lastName !=null;
    }
    public boolean hasPatronymic(){
        return this.patronymic != null;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(lastName, human.lastName) && Objects.equals(patronymic, human.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, patronymic, age);
    }


//    @Override
//    public Iterator<Human> iterator() {
//        return new HumanIterator(this);
//    }
}
