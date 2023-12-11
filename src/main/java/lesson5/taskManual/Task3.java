package lesson5.taskManual;
//очередность выполнения потоков
public class Task3 {
    public static void main(String[] args) throws InterruptedException{
        Runnable task =()->{
            try {
                Thread.sleep(10000);
                System.out.println("work done");
            }catch (InterruptedException e){
                System.out.println("Interrupted");
            }
        };
        Thread thread = new Thread(task);
        thread.start();
        thread.join();
        System.out.println("Finished");

    }

}
