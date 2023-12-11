package lesson5;

public class TicTac2 implements Runnable{
    private final String bracket;
    private final Object monitor;

    public TicTac2(String bracket) {
        this.bracket = bracket;
        this.monitor=TicTac2.class;
    }

    @Override
    public void run() {
        while (true){
            synchronized (monitor){
                System.out.print(bracket);
                try {
                    Thread.sleep(300);
                    monitor.notify();
                    monitor.wait();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread tic =new Thread(new TicTac("["));
        Thread tac =new Thread(new TicTac("]"));
       // tic.setDaemon(true);
       // tac.setDaemon(true);
        tic.start();
        tac.start();
    }
}
