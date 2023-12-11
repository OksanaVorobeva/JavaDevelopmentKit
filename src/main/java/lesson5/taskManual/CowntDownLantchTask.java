package lesson5.taskManual;

import java.util.concurrent.CountDownLatch;

public class CowntDownLantchTask {
    public static void main(String[] args) {
        CountDownLatch latch=new CountDownLatch(3);
        new Car(3000,latch,"CAR-1").start();
        new Car(2000,latch,"CAR-2").start();
        new Car(1000,latch,"CAR-3").start();
    }

    static class Car extends Thread{
        private int delay;
        public CountDownLatch latch;

        public Car(int delay, CountDownLatch latch,String name) {
            super(name);
            this.delay = delay;
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(delay);
                latch.countDown();
                System.out.println(Thread.currentThread().getName()+" finished");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
