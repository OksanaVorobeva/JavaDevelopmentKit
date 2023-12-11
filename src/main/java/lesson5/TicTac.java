package lesson5;

public class TicTac implements Runnable{
    private final String bracket;

    public TicTac(String bracket) {
        this.bracket = bracket;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(bracket);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
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
