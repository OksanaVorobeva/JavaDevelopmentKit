package lesson5.calculato2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class Task implements Runnable{
    private final AtomicInteger value;
    private CountDownLatch cdl;

    public Task(int value) {
        this.value = new AtomicInteger(value);
    }

    public  void inc(){
        value.incrementAndGet();
    }

    public int getValue() {
        return value.intValue();
    }

    public void setCdl(CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            inc();
        }
        cdl.countDown();
    }

    @Override
    public String toString() {
        return String.format("(%s)",value);
    }
}


