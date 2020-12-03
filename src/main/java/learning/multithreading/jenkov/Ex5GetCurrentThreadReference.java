package learning.multithreading.jenkov;

import static java.lang.System.out;

public class Ex5GetCurrentThreadReference {
    public static void main(String[] args) {
        out.println(Thread.currentThread());
        out.println(Thread.currentThread().getName());
        Runnable runnable = () -> {
            out.println("lambda running");
            out.println(Thread.currentThread());
            out.println(Thread.currentThread().getName());
            out.println("lambda finished");
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}

