package lesson5.calculator;

public class Task implements Runnable {

    private   int value;

    public Task(int value) {
        this.value = value;
    }


    @Override
    public void run() {
        System.out.println(value);
    }

    @Override
    public String toString() {
       return String.format("(%s)",value);
    }
}
