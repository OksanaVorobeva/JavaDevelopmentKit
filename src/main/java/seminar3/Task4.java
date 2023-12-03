package seminar3;

public class Task4 {
    //ОписатьинтерфейсPersonсметодамиdoWork()иhaveRest().
    // Написатьдваклассара- ботник и бездельник, реализующих интерфейс.
    // Работник работает, и не умеет бездель- ничать,
    // в то время как бездельник не умеет работать, но умеет отдыхать.
    // Написать обоб- щённые классы Workplace и Club, содержащие массив из Person.
    // В классах необходимо вызывать у всего массива людей вызывать соответствующие методы.

    interface Person{
        void doWork();
        void haveRest();
    }

    public static class Worker implements Person{
        @Override
        public void doWork() {
            System.out.println("Worker is working");
        }

        @Override
        public void haveRest() {
            System.out.println("What?");
        }
    }

    public static class Idler implements Person{
        @Override
        public void doWork() {
            System.out.println("No");
        }

        @Override
        public void haveRest() {
            System.out.println("Chill");
        }
    }

    private static class WorkPlace<T extends Person>{
        Person[] arr;

        public WorkPlace(T... peopple) {
            arr=peopple;
        }

        void  work(){
            for (Person person: arr) {
                person.doWork();
            }
        }
    }

    private static class Club<T extends Person>{
        Person[] arr;

        public Club(T... peopple) {
            arr=peopple;
        }

        void  chill(){
            for (Person person: arr) {
                person.haveRest();
            }
        }
    }

    public static void main(String[] args) {
        WorkPlace<Person> w = new WorkPlace<>(new Worker(),new Worker(),new Idler());
        Club<Person> c =new Club<>(new Worker(),new Worker(),new Idler());
        w.work();
        c.chill();
    }

}
