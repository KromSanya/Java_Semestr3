package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {

    public static int getCountStringsStartsWithChar(List<String> dataSet, Character start) {
        //Task1
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
        //Task2
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
        //Task3
        ArrayList<Human> list = new ArrayList<>();
        for (Human human : dataSet) {
            if (!human.equals(person)) {
                var temp = new Human(human.getName(), human.getLastName(), human.getPatronymic(), human.getAge());
                list.add(temp);
            }
        }
        return  list;
    }

    //Task4
    public static List<Set<Integer>> getSetList(List<Set<Integer>> listSet, Set<Integer> set) {
        return listSet.stream().filter(n -> !getIntersection(n, set).isEmpty()).toList();
    }

    public static Set<Integer> getIntersection(Set<Integer> set1, Set<Integer> set2) {
        HashSet<Integer> temp = new HashSet<>(set1);
        temp.retainAll(set2);
        return temp;
    }
}
