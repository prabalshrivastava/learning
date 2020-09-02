package learning.java.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class checkedExceptionExample2 {

    //Case 1
    checkedExceptionExample2() throws FileNotFoundException {
        fileNotFoundThrown();
    }


    public static void main(String[] args) throws IOException {

        try {
            fileNotFoundThrown();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        fileNotFoundThrown();
        malformedUrlException();//We have handled by declaring the IOException(Parent of MalformedUrlException) as part of method signature
//        parseException();
//        interruptedException();
    }

    private static void parseException() throws ParseException {
//        Java uses text parsing to create an object based on a given String. If parsing causes an error, it throws a ParseException.
//        For instance, we could represent Date in different ways e.g. dd/mm/yyyy or dd,mm,yyyy, but try to parse a string with a different format:
//        Here, the String is malformed and causes a ParseException.
        new SimpleDateFormat("MM, dd, yyyy").parse("invalid-date");
    }

    private static void malformedUrlException() throws MalformedURLException {
//        When working with URLs, we might encounter with MalformedURLException – if our URLs are invalid.
        new URL("malformedurl");
    }

    private static void fileNotFoundThrown() throws FileNotFoundException {
//        FileNotFoundException is a common type of IOException while working with the file system:
        new FileReader(new File("/invalid/file/location"));
    }

    private static void interruptedException() {
        ChildThread childThread = new ChildThread();
        childThread.start();
        childThread.interrupt();
    }
}


class ChildThread1 extends Thread {

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught!");
        }
    }
}