package learning.java.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class Reflection01Main {
    static public void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(in);
        out.println("Enter Class Name : ");
        String className = scanner.nextLine();
        Class<?> aClass = Class.forName(className);

        Field[] declaredFields = aClass.getDeclaredFields();
        Arrays.stream(declaredFields).forEach(out::println);

        Method[] declaredMethods = aClass.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(out::println);

        Annotation[] declaredAnnotations = aClass.getDeclaredAnnotations();
        Arrays.stream(declaredAnnotations).forEach(out::println);

        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        Arrays.stream(declaredConstructors).forEach(out::println);

    }
}
