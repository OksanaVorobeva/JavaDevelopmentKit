package lesson5.taskManual;

public class ThreadLocalTask {
    private static Integer conter=0;
    public static void main(String[] args) throws InterruptedException {
        new Thread(new TreadTask()).start();
        new Thread(new TreadTask()).start();
    }
    public static class TreadTask implements Runnable{
       ThreadLocal<Integer> threadCounter = new ThreadLocal<>();

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                conter++;
                if(threadCounter.get()!=null){
                    threadCounter.set(threadCounter.get()+1);
                }else {
                    threadCounter.set(0);
                }
            }
            System.out.println("Counter: "+conter);
            System.out.println("threadCounter: "+threadCounter.get());
        }
    }

}
