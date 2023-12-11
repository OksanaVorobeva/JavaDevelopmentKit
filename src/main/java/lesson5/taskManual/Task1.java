package lesson5.taskManual;
 //создание и управление потока
public class Task1 {
    /*public static void main(String[] args) {
        //мы всегда можем подучить текущий поток выполнения
        System.out.println(Thread.currentThread().getName());
        Runnable task =new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("Make some work!");
            }
        };
        Thread thread=new Thread(task);
        thread.start();
    */

     public static void main(String[] args) {
         System.out.println(Thread.currentThread().getName());
         ExampleThread exampleThread=new ExampleThread();
         exampleThread.start();
     }
     public static class ExampleThread extends Thread{
         @Override
         public void run() {
             System.out.println(Thread.currentThread().getName());
             System.out.println("Make some work!");
         }
     }
}
