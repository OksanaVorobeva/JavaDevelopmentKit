package seminar3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Task3 {
    //Написатьитераторпомассиву.Итератор–этообъект,осуществляющийдвижениепокол-
    // лекциям любого типа, содержащим любые типы данных. Итераторы обычно имеют
    // только два метода – проверка на наличие следующего элемента и переход к
    // следующему элемен- ту. Но также, особенно в других языках программирования,
    // возможно встретить итерато- ры, реализующие дополнительную логику.

    private static class ArrayIterator<T> implements Iterator<T> {
        private final T[] array;
        private int index = 0;

        public ArrayIterator(T[] array) {
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public T next() {
            return array[index++];
        }
    }

}
