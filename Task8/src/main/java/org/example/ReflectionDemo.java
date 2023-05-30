package org.example;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectionDemo {

    public static int findNumHuman(List<?> list)
    {
        int num=0;
        for (Object o : list) {
            if (o instanceof Human) {
                num++;
            }
        }
        return num;
    }

    public static <T> List<Method> getOpenMethods(T obj)
    {
        return Arrays.stream(obj.getClass().getMethods()).toList();
    }

    public static <T> List<String> getNameSuperClasses(T obj)
    {
        ArrayList<String> list = new ArrayList<>();
        Class<?> class_ = obj.getClass();
        while (class_ != null) {
            list.add(class_.getName());
            class_ = class_.getSuperclass();
        }
        return list;
    }
}
