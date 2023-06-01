import com.sun.jdi.VoidType;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Task5 {


    public static List<String> getGetterSetter(Object obj)
    {
        var temp = obj.getClass();
        ArrayList<String> res = new ArrayList<>();
        var methods = temp.getDeclaredMethods();
        for(Method method : methods)
        {
            if(method.getName().startsWith("get") && method.getModifiers() != Modifier.STATIC &&
                !method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 0)
            {
                res.add(method.getName());
            }
            if(method.getName().startsWith("set") && method.getModifiers() != Modifier.STATIC &&
                    method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1)
            {
                res.add(method.getName());
            }
        }
        return res;
    }

}
