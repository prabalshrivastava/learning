package learning.java.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class checkedExceptionThrowVsHandled {
    public static void main(String[] args) throws FileNotFoundException {
        fileNotFoundHandled();
        fileNotFoundThrown();
    }

    private static void fileNotFoundHandled() {
        try {
            new FileReader(new File("/invalid/file/location"));
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught!");
        }
    }

    private static void fileNotFoundThrown() throws FileNotFoundException {
        new FileReader(new File("/invalid/file/location"));
    }
}
