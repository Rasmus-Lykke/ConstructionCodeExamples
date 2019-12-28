package Threads;

public class ThreadExample extends java.lang.Thread {

    public void run() {
        try {
            // Displaying the thread that is running
            System.out.println("Normal thread " +
                    ThreadExample.currentThread().getId() +
                    " is running");
        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}



