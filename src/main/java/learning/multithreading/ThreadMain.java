package learning.multithreading;

import static java.lang.System.out;

class MyFirstThread extends Thread {
    @Override
    public void run() {
        out.println("running myfirstthread");
    }
}

class MyFirstRunnable implements Runnable {
    @Override
    public void run() {
        out.println("running MyFirstRunnable");
    }
}

public class ThreadMain {
    public static void main(String[] args) {
        //A). Creating Thread using Thread class.
        //1). New - Thread Object creation.
        MyFirstThread thread = new MyFirstThread();

        //2). Runnable - on start() -
        //A new thread starts(with new callstack).
        //The thread moves from New state to the Runnable state.
        //When the thread gets a chance to execute, its target run() method will run.
        thread.start();

        //3). Running - when scheduler picks up

        //4). Non-Runnable (Blocked) - On calling sleep(),wait(),suspend(),Block on IO,Block on lock acquiring failure on an object

        //5). Runnable - On sleep() completion,notify(),notifyAll(),resume(),IO complete,Lock available

        //6). Terminated - stop(),run() exits

        //B). Creating Thread using Runnable
        MyFirstRunnable myFirstRunnable = new MyFirstRunnable();
        Thread myRunnableThread = new Thread(myFirstRunnable);
        myRunnableThread.start();
    }
}