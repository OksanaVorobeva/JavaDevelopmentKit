import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class HWKostik {
    static int numberWinner;


    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        List<Command> commands = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            commands.add(new Command(i, countDownLatch));
        }

        for (Command command : commands) {
            command.start();
        }


        countDownLatch.await();
        System.out.println("Победила " + numberWinner);

    }

    public static synchronized void checkWinner(int numberCommand) {
        if (numberWinner == 0) {
            numberWinner = numberCommand;
        }
    }
}

abstract class Member extends Thread {
    String name;

    long sleep;


    public Member(String name, long sleep) {
        this.name = name;
        this.sleep = sleep;
    }

    @Override
    public void run() {
        move();
    }

    abstract void move();

}

class Runner extends Member {
    public Runner(String name, long sleep) {
        super(name, sleep);
    }


    @Override
    void move() {

        try {
            System.out.println(" Начал бежать " + name);
            Thread.sleep(sleep);
            System.out.println(" Прибежал " + name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

class Swimmer extends Member {
    public Swimmer(String name, long sleep) {
        super(name, sleep);
    }

    @Override
    void move() {
        try {
            System.out.println(" Начал плыть " + name);
            Thread.sleep(sleep);
            System.out.println(" Приплыл " + name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Biker extends Member {

    public Biker(String name, long sleep) {
        super(name, sleep);
    }

    @Override
    void move() {
        try {
            System.out.println(" Начал ехать " + name);
            Thread.sleep(sleep);
            System.out.println(" Приехал " + name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Command extends Thread {

    List<Member> command;
    int numberCommand;

    CountDownLatch cdl;

    public Command(int numberCommand, CountDownLatch cdl) {
        this.cdl = cdl;
        Random random = new Random();
        this.numberCommand = numberCommand;
        this.command = new ArrayList<>();
        command.add(new Runner("Бегун " + numberCommand, random.nextLong(1000, 3000)));
        command.add(new Swimmer("Плавец " + numberCommand, random.nextLong(1000, 3000)));
        command.add(new Biker("Байкер " + numberCommand, random.nextLong(1000, 3000)));
    }


    @Override
    public void run() {
        try {
            for (Member member : command) {
                member.start();
                member.join();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Команда " + numberCommand + " финишировала");
        cdl.countDown();
        HWKostik.checkWinner(numberCommand);

    }
}
