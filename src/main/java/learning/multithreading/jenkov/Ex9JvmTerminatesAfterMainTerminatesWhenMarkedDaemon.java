package learning.multithreading.jenkov;

import static java.lang.System.out;

public class Ex9JvmTerminatesAfterMainTerminatesWhenMarkedDaemon {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            while (true) {
                // "The Runnable Thread" is a daemon thread Will keep running infinitely
                // and JVM will terminate until the non-daemon thread runs.
                // Here only main is non-daemon thread.
                sleep(1000);
                out.println(Thread.currentThread().getName() + " running");
            }
        };
        Thread thread = new Thread(runnable, "The Runnable Thread");
        //Marking "The Runnable Thread" as daemon
        thread.setDaemon(true);
        thread.start();
        sleep(3000);
        // Main thread will be exiting in sometime and JVM will terminate
        // because this is the only non-daemon thread running.
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

