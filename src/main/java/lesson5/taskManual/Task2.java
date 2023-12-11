package lesson5.taskManual;
//остановка потока
public class Task2 {

    public static void main(String[] args) {
       /* Runnable task=()->{
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        };
        Thread thread = new Thread(task);
        thread.start();
        thread.interrupt();
    */

     /*   Runnable task = () -> {
            while (!Thread.currentThread().isInterrupted()) {

            }
            System.out.println("Finished");
        };
        Thread thread = new Thread(task);
        thread.start();
        thread.interrupt();*/

        Runnable task =()->{
            try {
                Thread.currentThread().sleep(10000);
                System.out.println("Waked up");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("you here");
    }
}
