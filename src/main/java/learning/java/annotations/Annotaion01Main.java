package learning.java.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

import static java.lang.System.out;

public class Annotaion01Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Annotation[] annotations = ReadmeDemo.class.getDeclaredAnnotations();
        Arrays.stream(annotations).forEach(out::println);

        Method method = ReadmeDemo.class.getDeclaredMethod("demoMethod");
        Annotation[] annotations1 = method.getAnnotations();
        Arrays.stream(annotations1).forEach(out::println);

        Readme declaredAnnotation = ReadmeDemo.class.getDeclaredAnnotation(Readme.class);
        out.println(declaredAnnotation.value());
        out.println(declaredAnnotation.info());
        out.println(declaredAnnotation.company());
    }
}
