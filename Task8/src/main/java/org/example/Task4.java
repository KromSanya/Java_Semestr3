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
            if(t instanceof Executable)
            {
               count++;
                       //((Executable) t).execute();
            }

        }
        return count;
    }

}
