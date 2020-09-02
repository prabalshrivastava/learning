package learning.java.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class NestedCatchBlocks {

    public static void main(String[] args) {
        //case 1 //nesting from specific to generic
//        String s = null;
//        try {
//            s.toString();
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//        } catch (Error e) {
//            e.printStackTrace();
//        } catch (Throwable e) {
//            e.printStackTrace();
//        }


        //case 2 //nesting from generic to specific throws compiler error
//        String s = null;
//        try {
//            s.toString();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//        }
    }
}