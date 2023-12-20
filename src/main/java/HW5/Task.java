package HW5;


import java.util.concurrent.CountDownLatch;

public class Task {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Philosopher("1"));
        Thread thread2 = new Thread(new Philosopher("2"));
        Thread thread3 = new Thread(new Philosopher("3"));
        Thread thread4 = new Thread(new Philosopher("4"));
        Thread thread5 = new Thread(new Philosopher("5"));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
    }
}
class Philosopher implements Runnable {
    String name;

    public Philosopher(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Обедаю" + Thread.currentThread().getName());
                Thread.sleep(500);
                System.out.println("Отдыхаю" + Thread.currentThread().getName());
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

