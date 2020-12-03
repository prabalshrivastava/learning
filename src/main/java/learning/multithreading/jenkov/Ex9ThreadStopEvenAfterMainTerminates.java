package learning.multithreading.jenkov;

import static java.lang.System.out;

public class Ex9ThreadStopEvenAfterMainTerminates {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            while (true) {
                sleep(1000);
                out.println(Thread.currentThread().getName() + " running");
            }
        };
        Thread thread = new Thread(runnable, "The Runnable Thread");
        thread.start();
        sleep(3000);
        out.println(Thread.currentThread().getName() + " exiting");
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

