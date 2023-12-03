package seminar3;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;

public class Task5 {
    //Внедрить итератор из задания 2 в коллекцию,
    // написанную в задании 3 таким образом, чтобы итератор
    // был внутренним классом и, соответственно, объектом в коллекции.

    private static class  OList<T> implements Iterable<T>{
        class ArrayIterator<T> implements Iterator<T> {

            private int index = 0;


            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public T next() {
                if (!hasNext());
                return (T) arr[index++];
            }
        }

        Object[] arr;
        int count;
        OList.ArrayIterator iter;
        OList() {
            arr = new Object[1];
            count = 0;
        }

        void add(T item) {
            if (count == arr.length) {
                Object[] newArr = new Object[arr.length * 2];
                System.arraycopy(arr, 0, newArr, 0, arr.length);
                arr = newArr;
            }
            arr[count++] = item;
        }

        T remove() {
            if (count == 0) throw new NoSuchElementException();
            count--;
            T temp = (T) arr[count];
            arr[count] = null;
            return temp;
        }


        @Override
        public Iterator<T> iterator() {
            return iter;
        }

        @Override
        public Spliterator<T> spliterator() {
            return Iterable.super.spliterator();
        }

        @Override
        public String toString() {
            return Arrays.toString(arr);
        }
    }

}
