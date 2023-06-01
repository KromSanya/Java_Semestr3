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
        var temp = obj.getClass().getDeclaredMethods();
//        int mods = obj.getClass().getModifiers();
//        var list = new ArrayList<Method>();
//        for(int i = 0; i < temp.length;i++)
//        {
//            if(temp[i].getModifiers() == Modifier.PUBLIC)
//                list.add(temp[i]);
//        }
//       // return list;
        return Arrays.stream(temp).filter(val -> val.getModifiers() == Modifier.PUBLIC).toList();
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
