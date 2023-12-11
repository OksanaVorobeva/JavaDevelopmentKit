package lesson5.taskManual;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTask {
    static Integer resourse =Integer.valueOf(0);

    public static void main(String[] args) throws InterruptedException {
        ReentrantLock locker= new ReentrantLock();
        for (int i = 0; i < 5; i++) {
            Thread thread=new Thread(new LockTread(locker));
            thread.start();
            thread.join();
        }
    }

    static class LockTread implements Runnable{
        ReentrantLock locker;

        public LockTread(ReentrantLock locker) {
            this.locker = locker;
        }

        @Override
        public void run() {
            locker.lock();
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.printf("s%  %d \n", Thread.currentThread().getName(),resourse.intValue());
                    resourse++;
                    Thread.sleep(100);
                }
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }finally {
                locker.unlock();
            }
        }
    }
}
