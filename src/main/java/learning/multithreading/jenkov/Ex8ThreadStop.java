package learning.multithreading.jenkov;

import static java.lang.System.out;

public class Ex8ThreadStop {
    public static class StoppableRunnable implements Runnable {
        private boolean stopRequested = false;

        public synchronized void requestStop() {
            stopRequested = true;
        }

        public synchronized boolean isStopRequested() {
            return this.stopRequested;
        }

        private void sleep(int millis) {
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            out.println("StoppableRunnable Running");
            while (!isStopRequested()) {
                sleep(1000);
                out.println("...");
            }
            out.println("StoppableRunnable Stopped");
        }
    }

    public static void main(String[] args) {
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread = new Thread(stoppableRunnable, "The Stoppable Thread");
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        out.println("Requesting Stop");
        stoppableRunnable.requestStop();
        out.println("Stop Requested");
    }
}

