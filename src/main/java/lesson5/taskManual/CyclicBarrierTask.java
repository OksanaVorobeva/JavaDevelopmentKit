package lesson5.taskManual;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTask {
    public static void main(String[] args) throws BrokenBarrierException,InterruptedException{
        CyclicBarrier cyclicBarrier=new CyclicBarrier(3);

        new Car(3000,cyclicBarrier,"CAR-1").start();
        new Car(2000,cyclicBarrier,"CAR-2").start();
        new Car(1000,cyclicBarrier,"CAR-3").start();

        System.out.println(Thread.currentThread().getName()+
        "has funushed");
    }

    static class Car extends Thread{
        private int delay;
        private CyclicBarrier cyclicBarrier;

        public Car(int delay, CyclicBarrier cyclicBarrier,String name) {
            super(name);
            this.delay = delay;
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(delay);
                cyclicBarrier.await();
                System.out.println(Thread.currentThread().getName()+" finished");
            }catch (InterruptedException| BrokenBarrierException e){
                e.printStackTrace();
            }
        }
    }
}
