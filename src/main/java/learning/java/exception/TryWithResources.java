package learning.java.exception;

import java.io.*;
import java.net.URLDecoder;
import java.util.Scanner;

public class TryWithResources {
    //Support for try-with-resources – introduced in Java 7 – allows us to declare resources to be used in a try block with the assurance that the resources will be closed when after the execution of that block.

    public static void main(String[] args) throws IOException {

        //case 1
//        Scanner scanner = null;
//        try {
//            scanner = new Scanner(new File("D:\\development\\Git Repository\\learning\\src\\main\\java\\learning\\java\\exception\\TryWithResources.java"));
//            while (scanner.hasNext()) {
//                System.out.println(scanner.nextLine());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            if (scanner != null) {
//                scanner.close();
//            }
//        }


        //case 2
//        try (Scanner scannerToBeAutoClosed = new Scanner(
//                new File("D:\\development\\Git Repository\\learning\\src\\main\\java\\learning\\java\\exception\\TryWithResources.java"))) {
//            while (scannerToBeAutoClosed.hasNext()) {
//                System.out.println(scannerToBeAutoClosed.nextLine());
//            }
//        } catch (FileNotFoundException fnfe) {
//            fnfe.printStackTrace();
//        }

        //case 3
//        try (PrintWriter writer = new PrintWriter(new File("test.txt"))) {
//            writer.println("Hello World");
//            System.out.println(new File("test.txt").getAbsolutePath());
//        }

        //case 4
//        try (BufferedReader reader = new BufferedReader(
//                new FileReader("D:\\development\\Git Repository\\learning\\src\\main\\java\\learning\\java\\exception\\TryWithResources.java"))) {
//            System.out.println(reader.readLine());
//        }

//        try (BufferedReader reader = new BufferedReader(
//                new FileReader(URLDecoder.decode(TryWithResources.class.getResource("TryWithResources.class").getPath())))) {
//            System.out.println(reader.readLine());
//        }

//        try (BufferedReader reader = new BufferedReader(
//                new FileReader(URLDecoder.decode(TryWithResources.class.getResource("abc.txt").getPath())))) {
//            System.out.println(reader.readLine());
//
//            String str;
//            while ((str = reader.readLine()) != null) {
//                System.out.println(str);
//            }
//        }


//        try (BufferedReader reader = new BufferedReader(new FileReader("./abc.txt"))) {
//            System.out.println(reader.readLine());
//
//            String str;
//            while((str =reader.readLine())!=null){
//                System.out.println(str);
//            }
//        }

    }
}
