package org.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Task4 {

    public static <T> int numFindElem(List<T> list)
    {
        int count = 0;

        for(T t: list)
        {
            try {
                Method methods = t.getClass().getMethod("execute");
                if ( methods.getName().equals("execute")) {

                }
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }


        }
        return count;
    }

}
