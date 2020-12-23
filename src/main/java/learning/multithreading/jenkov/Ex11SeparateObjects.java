package learning.multithreading.jenkov;

import static java.lang.System.out;

public class Ex11SeparateObjects {
    public static void main(String[] args) {
        Runnable runnable1 = new MyRunnable();
        Runnable runnable2 = new MyRunnable();

        // Here the count field does not gets shared between different threads as each thread has separate MyRunnable
        // and hence separate count field in separate object space.
        Thread thread1 = new Thread(runnable1, "Thread 1");
        Thread thread2 = new Thread(runnable2, "Thread 2");

        thread1.start();
        thread2.start();
    }
}

class MyRunnable implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            this.count++;
        }
        out.println(Thread.currentThread().getName() + " : " + this.count);
    }
}