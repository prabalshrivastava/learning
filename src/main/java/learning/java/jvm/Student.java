package learning.java.jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student {
    private String name;
    private int rollNo;

    public String getName() {
        return name;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

class Test {
    public static void main(String args[]) {
        System.out.println(Thread.currentThread().getStackTrace().length);

        Student s = new Student();
        Class c = s.getClass();
        System.out.println(c.getName());

        Method[] m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++)
            System.out.println(m[i]);

        Field[] f = c.getDeclaredFields();
        for (int i = 0; i < f.length; i++)
            System.out.println(f[i]);

    }
}