package learning.multithreading.jenkov;

import static java.lang.System.out;

public class Ex2Way2ToCreateThread {

    static class MyThread implements Runnable {
        @Override
        public void run() {
            out.println("MyThread running");
            out.println("MyThread finished");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread  = new Thread(myThread);
        thread.start();
    }
}

