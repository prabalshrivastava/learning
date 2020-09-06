package learning.java.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Middleware {
    public static Object callMethod(String className, String methodName, Class<?>[] argsType, Object[] argsValue)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //load the class
        Class<?> aClass = Class.forName(className);

        //create the object of the class
        Object instance = aClass.newInstance();

        //find the method of the class
        Method method = aClass.getDeclaredMethod(methodName, argsType);

        //invoke the method on the class and collect the result
        Object result = method.invoke(instance);

        //return the result
        return result;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Object object = callMethod("java.util.Date", "toString", null, null);
        System.out.println(object);
        Object add = callMethod("learning.java.reflection.Airthmetic", "add", new Class<?>[]{Integer.class, Integer.class}, new Object[]{12,5});
        System.out.println(add);
//        Object sub = callMethod("learning.java.reflection.Airthmetic", "add", new Class[]{Integer.class, Integer.class}, new Object[]{12, 5});
//        System.out.println(sub);
    }
}
