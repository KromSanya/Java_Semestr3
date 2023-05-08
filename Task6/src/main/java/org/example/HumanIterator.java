package org.example;


import java.util.Iterator;


public class HumanIterator implements Iterator<Human> {
    private Human human;
    private int i;


    public HumanIterator(Human human) {
        this.human = human;
    }

    @Override
    public boolean hasNext() {
        return human.hasName() || human.hasLastname() || human.hasPatronymic();
    }

    @Override
    public Human next() {
        return human;

    }
}
