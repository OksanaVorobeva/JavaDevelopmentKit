package seminar5Kostik.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Race extends Thread {
    private List<Runner> runners;
    private CountDownLatch cdl;

    public Race() {
        cdl = new CountDownLatch(3);
        runners = new ArrayList<>(3);
        runners.add(new Runner("Василий", cdl));
        runners.add(new Runner("Петр", cdl));
        runners.add(new Runner("Семен", cdl));
    }

    @Override
    public void run() {
        try {
            goOneStart();
            cdl.await();
            goAll();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void goOneStart() {
        for (Runner runner : runners) {
            runner.start();
        }
    }

    private void goAll() throws InterruptedException {
        sleep(1000);
        System.out.println("На старт");
        sleep(1000);
        System.out.println("Внимание");
        sleep(1000);
        System.out.println("Марш");
        for (Runner runner : runners) {
            runner.go();
        }
    }
}
