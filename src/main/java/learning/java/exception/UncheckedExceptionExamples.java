package learning.java.exception;

import java.io.File;
import java.io.FileReader;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class UncheckedExceptionExamples {
    public static void main(String[] args) throws InterruptedException {
//        Common Scenarios of Java Exceptions
//        There are given some scenarios where unchecked exceptions may occur. They are as follows:

//        1) A scenario where ArithmeticException occurs
//        If we divide any number by zero, there occurs an ArithmeticException.
//        int b = 50 / 0;//ArithmeticException


//        2) A scenario where NullPointerException occurs
//        If we have a null value in any variable, performing any operation on the variable throws a NullPointerException.
//        String s = null;
//        System.out.println(s.length());//NullPointerException


//        3) A scenario where NumberFormatException occurs
//        The wrong formatting of any value may occur NumberFormatException. Suppose I have a string variable that has characters, converting this variable into digit will occur NumberFormatException.
//        String s1 = "abc";
//        int i = Integer.parseInt(s1);//NumberFormatException


//        4) A scenario where ArrayIndexOutOfBoundsException occurs
//        If you are inserting any value in the wrong index, it would result in ArrayIndexOutOfBoundsException as shown below:
//        int a[] = new int[5];
//        a[10] = 50; //ArrayIndexOutOfBoundsException


//        5) A scenario where StringIndexOutOfBoundsException occurs
//        "prabal".charAt(6);


//        6) A scenario where StringIndexOutOfBoundsException occurs
//        Number number = 10;
//        System.out.println(number instanceof Integer); //true
//        Integer i = (Integer) number;


//        Casting is only possible for parent child relationships ie if the two classes fall into the parent child hierarchy
//        Integer i1 = 10;
//        String s1 = (String) i1;
//        Object o = i1;
//        Integer i2 = (Integer) o;


//        7) A scenario where IllegalArgumentException occurs
//        A method throws an IllegalArgumentException if we call it with some illegal or inappropriate arguments.
//                For instance, the sleep() method of the Thread class expects positive time and we pass a negative time interval as an argument. This results in IllegalArgumentException:
//        Thread.currentThread().sleep(-10000); // Throws IllegalArgumentException


//        8) A scenario where IllegalStateException occurs
//        IllegalStateException signals that a method's been invoked at an illegal or inappropriate time.
//        Every Java object has a state (instance variables) and some behavior (methods). Thus, IllegalStateException means it's illegal to invoke the behavior of this object with the current state variables.
//        However, with some different state variables, it might be legal.
//                For example, we use an iterator to iterate a list. Whenever we initialize one, it internally sets its state variable lastRet to -1.
//        With this context, the program tries to call the remove method on the list:
//        Internally, the remove method checks the state variable lastRet and if it is less than 0, it throws IllegalStateException. Here, the variable is still pointing to the value -1.
//        As a result, we get an IllegalStateException.
//        Initialized with index at -1
        Iterator<Object> intListIterator = new ArrayList<>().iterator();
        intListIterator.remove(); // IllegalStateException
    }
}
