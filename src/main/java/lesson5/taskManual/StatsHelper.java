package lesson5.taskManual;

import java.util.Scanner;

public class StatsHelper {
    private static int cnt = 0;

    public static void main(String[] args) {

        Thread readTread = new Thread(() -> {
            Scanner in = new Scanner(System.in);
            while (in.hasNextLine()&& !Thread.interrupted()) {
                in.nextLine();
                cnt++;
            }
        });
        readTread.setDaemon(true);
        readTread.start();
        readTread.interrupt();

        while (true) {
            System.out.println(cnt + "messages inputted by user");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
