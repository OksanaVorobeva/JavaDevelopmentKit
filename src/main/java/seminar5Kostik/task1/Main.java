package seminar5Kostik.task1;

//В рамках выполнения задачи необходимо:
//● Создать два класс ObjectA, ObjectB
//● Реализовать класс в котором два потока при запуске провоцируют DeadLock для объектов ObjectA, ObjectB
public class Main {

    public static void main(String[] args) {
        Friend friend1 = new Friend("Вася");
        Friend friend2 = new Friend("Петя");

        MyTread thread1 = new MyTread(friend1, friend2);
        MyTread tread2 = new MyTread(friend2, friend1);

        thread1.start();
        tread2.start();

        System.out.println("Конец работы");

    }
}
