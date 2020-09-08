package learning.java.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChainedException {

    public static void main(String[] args) {
        int i = 0;
        try {
            new FileInputStream(new File("kjehrnkqjrkq"));
        } catch (FileNotFoundException e) {
        }


    }
}