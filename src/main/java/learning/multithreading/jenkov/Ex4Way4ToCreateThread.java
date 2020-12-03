package learning.multithreading.jenkov;

import static java.lang.System.out;

public class Ex4Way4ToCreateThread {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            out.println("lambda running");
            out.println("lambda finished");
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}

