package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class HumansIterator implements Iterator<Human> {
    private ArrayList<Human> humans;
    private int i=0;
    public HumansIterator(Human human) {
        humans.add(human);
    }

    @Override
    public boolean hasNext() {
        if(humans.get(i).hasName() || humans.get(i).hasLastname() || humans.get(i).hasPatronymic()) {
            i++;
            return true;
        }
        else return false;
    }

    @Override
    public Human next() {
        return null;
    }
}
