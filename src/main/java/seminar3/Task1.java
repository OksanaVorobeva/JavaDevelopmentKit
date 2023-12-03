package seminar3;

import java.io.InputStream;
import java.io.Serializable;

public class Task1 {
    //Создать обобщенный класс с тремя параметрами (T, V, K).
    // Класс содержит три перемен- ные типа (T, V, K), конструктор,
    // принимающий на вход параметры типа (T, V, K), методы возвращающие
    // значения трех переменных. Создать метод, выводящий на консоль имена
    // классов для трех переменных класса. Наложить ограничения на параметры
    // типа: T дол- жен реализовать интерфейс Comparable (классы оболочки, String),
    // V должен реализо- вать интерфейс DataInput и расширять класс InputStream,
    // K должен расширять класс Number.

    private static class  MyClass<T extends  Comparable,V extends InputStream & Serializable,K extends  Number>{
        T t;
        V v;
        K k;

        public MyClass(T t, V v, K k) {
            this.t = t;
            this.v = v;
            this.k = k;
        }

        void print(){
            System.out.printf(t.getClass().getName(), v.getClass().getName(),k.getClass().getName());
        }

    }



}
