package HW3;

import lesson3.GBox;
import lesson3.KVBox;
import lesson3.TBox;

public class Task3 <K,V>{
    //Напишите обобщенный класс Pair, который представляет
    // собой пару значений разно- го типа. Класс должен иметь методы
    // getFirst(), getSecond() для получения значений пары, а также
    // переопределение метода toString(), возвращающее строковое представ- ление пары.
    private K key;
    private V value;

    public Task3(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getFirst() {
        return key;
    }

    public V getSecond() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(getFirst().toString()+ " " +getSecond().toString());
    }

    public static void main(String[] args) {
        Task3<Integer,String> kvBox = new Task3<>(1,"Hello");
        Task3<Integer,String> kvBox1 = new Task3<>(2,"Hello");
      // kvBox.showType();
        System.out.println(kvBox);
        System.out.println(kvBox);
    }
}

