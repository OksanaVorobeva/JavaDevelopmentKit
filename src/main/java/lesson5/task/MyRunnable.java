package lesson5.task;

import java.util.RandomAccess;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("2.Hello from: " + Thread.currentThread());
    }
}
