package learning.java.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.System.out;

public class Middleware {
    public static Object callMethod(String className, String methodName, Class<?>[] argsType, Object[] argsValue)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //load the class
        Class<?> aClass = Class.forName(className);

        //create the object of the class
        Object instance = aClass.newInstance();

        //find the method of the class
        Method method = aClass.getDeclaredMethod(methodName, argsType);

        //make access specified wider in nature
        method.setAccessible(true);

        //invoke the method on the class and collect the result
        Object result = method.invoke(instance,argsValue);

        //return the result
        return result;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Object object = callMethod("java.util.Date", "toString", null, null);
        out.println(object);
        Object add = callMethod("learning.java.reflection.Airthmetic", "add", new Class<?>[]{Integer.class, Integer.class}, new Object[]{12,5});
        out.println(add);
        Object sub = callMethod("learning.java.reflection.Airthmetic", "sub", new Class[]{Integer.class, Integer.class}, new Object[]{12, 5});
        out.println(sub);
    }
}

class Airthmetic {
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
    private Integer sub(Integer a, Integer b) {
        return a - b;
    }
}
