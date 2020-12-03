package learning.multithreading.jenkov;

import static java.lang.System.out;

public class Ex6ThreadRunsInRandomOrder {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            out.println(Thread.currentThread().getName() + " running");
            out.println(Thread.currentThread().getName() + " finished");
        };
        Thread thread = new Thread(runnable);
        thread.start();
        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
        Thread thread3 = new Thread(runnable);
        thread3.start();
    }
}

