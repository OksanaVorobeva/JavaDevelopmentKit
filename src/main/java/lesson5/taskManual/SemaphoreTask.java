package lesson5.taskManual;

import java.util.concurrent.Semaphore;

public class SemaphoreTask {
    private static Integer count=Integer.valueOf(0);

    public static void main(String[] args) {
        Semaphore sem=new Semaphore(2);
        new Thread(new CountThread(sem)).start();
        new Thread(new CountThread(sem)).start();
        new Thread(new CountThread(sem)).start();
    }

    static class CountThread implements Runnable{
        Semaphore sem;

        public CountThread(Semaphore sem) {
            this.sem = sem;
        }

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName()+"ожидает разрешение");
                sem.acquire();
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName()+": "+count);
                    count++;
                    Thread.sleep(100);
                }
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName()+"освобождает разрешение");
            sem.release();
        }
    }
}
