package seminar5Kostik.task2;

//В рамках выполнения задачи необходимо:
//● Создайте два потока A и B.
//● Поток A меняет значение Boolean переменной switcher с задержкой 1000 миллисекунд
// (true в состояние false и наоборот).
//● Поток B ожидает состояния true переменной switcher и выводит на консоль обратный отсчет
// от 100 с задержкой 100 миллисекунд и приостанавливает свое действие, как только поток
// A переключит switcher в состояние false.
//● Условием завершения работы потоков является достижение отсчета нулевой отметки.
//● Можно воспользоваться синхронизацией для управления значения переменной или volatile
public class Main {
    public static void main(String[] args) {
        MyProgramState state = new MyProgramState();

        MyTread1 tread1 = new MyTread1(state);
        MyTread2 tread2 = new MyTread2(state);

        tread1.start();
        tread2.start();
    }
}
