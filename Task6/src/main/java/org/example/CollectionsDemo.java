package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {

    public static int getCountStringsStartsWithChar(List<String> dataSet, Character start) {
       // return (int) dataSet.stream().filter(n -> n.startsWith(String.valueOf(start))).count();
        int i = 0;
        for(int j = 0; j < dataSet.size();j++)
        {
            if(dataSet.get(j).startsWith(String.valueOf(start)))
            {
                i++;
            }
        }
        return i;
    }

    public static List<Human> getListPeopleWhoLastNameEqualsWithPerson(List<Human> dataSet, Human person) {
        //return dataSet.stream().filter(n -> n.getLastName().equals(person.getLastName())).toList();
        ArrayList<Human> list = new ArrayList<>();
        for(int j = 0; j < dataSet.size();j++)
        {
            if(dataSet.get(j).getLastName().equals(person.getLastName()))
            {
                list.add(dataSet.get(j));
            }
        }
        return  list;
    }

    public static List<Human> getListPeopleWithOutPerson(List<Human> dataSet, Human person) {
       // return dataSet.stream().filter(n -> !n.equals(person)).toList();
        ArrayList<Human> list = new ArrayList<>();
        for(int j = 0; j < dataSet.size();j++)
        {
            if(!dataSet.get(j).equals(person))
            {
                list.add(dataSet.get(j));
            }
        }
        return  list;
    }

    public static List<Set<Integer>> getSetList(List<Set<Integer>> listSet, Set<Integer> set) {
        return listSet.stream().filter(n -> !getIntersection(n, set).isEmpty()).toList();
    }

    public static Set<Integer> getIntersection(Set<Integer> set1, Set<Integer> set2) {
        var temp = new HashSet<>(set1);
        temp.retainAll(set2);
        return temp;
    }
}
