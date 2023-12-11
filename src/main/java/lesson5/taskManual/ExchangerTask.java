package lesson5.taskManual;

import java.util.concurrent.Exchanger;

public class ExchangerTask {
    public static void main(String[] args) {
        Exchanger<String> ex= new Exchanger<>();
        new Thread(new NewThread(ex,"First message","First Thread")).start();
        new Thread(new NewThread(ex,"Second message","Second Thread")).start();

    }

    static class NewThread implements Runnable{
        Exchanger<String> exchanger;
        String message;
        String name;

        public NewThread(Exchanger<String> exchanger, String message, String name) {
            this.exchanger = exchanger;
            this.message = message;
            this.name = name;
        }

        @Override
        public void run() {
            try {
                message=exchanger.exchange(message);
                System.out.println(name+" has received: "+message);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

}
