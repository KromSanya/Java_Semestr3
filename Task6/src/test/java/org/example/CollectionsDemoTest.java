package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsDemoTest {
    @Test
    void getCountStringsStartsWithChar() {
        ArrayList<String> data = new ArrayList<>() {{
            add("aaa");
            add("aab");
            add("bab");
            add("dbb");
        }};

        Assertions.assertEquals(2, CollectionsDemo.getCountStringsStartsWithChar(data, 'a'));
        Assertions.assertEquals(1, CollectionsDemo.getCountStringsStartsWithChar(data, 'b'));
        Assertions.assertEquals(0, CollectionsDemo.getCountStringsStartsWithChar(data, 'c'));
    }

    @Test
    void getListPeopleWhoLastNameEqualsWithPerson() {
        Human human1 = new Human("name", "surname", "ppp", 10);
        Human human2 = new Human("name", "surname2", "ppp", 10);
        Human human3 = new Human("name", "surname3", "ppp", 10);

        ArrayList<Human> data = new ArrayList<>() {{
            add(new Human("name", "surname", "ppp", 10));
            add(new Human("name", "surname", "ppp", 10));
            add(new Human("name", "surname", "ppp", 10));
            add(new Human("name", "surname2", "ppp", 10));
        }};

        Assertions.assertEquals(3, CollectionsDemo.getListPeopleWhoLastNameEqualsWithPerson(data, human1).size());
        Assertions.assertEquals(1, CollectionsDemo.getListPeopleWhoLastNameEqualsWithPerson(data, human2).size());
        Assertions.assertEquals(0, CollectionsDemo.getListPeopleWhoLastNameEqualsWithPerson(data, human3).size());
    }

    @Test
    void getListPeopleWithOutPerson() {
        Human human = new Human("name", "surname", "ppp", 10);

        ArrayList<Human> data = new ArrayList<>() {{
            add(new Human("name", "surname", "ppp", 10));
            add(new Human("name", "surname2", "ppp", 10));
        }};

        ArrayList<Human> dataWithoutHuman = new ArrayList<>() {{
            add(new Human("name", "surname2", "ppp", 10));
        }};

        var res = CollectionsDemo.getListPeopleWithOutPerson(data, human);
        Assertions.assertEquals(dataWithoutHuman, res);

        data.get(1).setAge(333);
        Assertions.assertEquals(dataWithoutHuman, res);
    }

    @Test
    void getSetList() {
        ArrayList<Set<Integer>> setList = new ArrayList<>() {{
            add(new HashSet<>() {{
                add(1);
                add(2);
                add(3);
            }});
            add(new HashSet<>() {{
                add(3);
                add(4);
                add(5);
            }});
            add(new HashSet<>() {{
                add(7);
            }});
        }};

        HashSet<Integer> set = new HashSet<>() {{
            add(3);
        }};

        List<Set<Integer>> res = CollectionsDemo.getSetList(setList, set);

        Assertions.assertEquals(2, res.size());
        Assertions.assertEquals(3, res.get(0).size());
        Assertions.assertEquals(3, res.get(1).size());
    }

    @Test
    void getIntersection() {
        HashSet<Integer> set1 = new HashSet<>() {{
            add(1);
            add(2);
            add(3);
            add(4);
        }};

        HashSet<Integer> set2 = new HashSet<>() {{
            add(5);
            add(6);
            add(3);
            add(4);
        }};

        HashSet<Integer> intersection = new HashSet<>() {{
            add(3);
            add(4);
        }};

        Assertions.assertEquals(intersection, CollectionsDemo.getIntersection(set1, set2));
    }
}