package seminar3;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Task2 {
    //Описать собственную коллекцию – список на основе массива.
    // Коллекция должна иметь возможность хранить любые типы данных,
    // иметь методы добавления и удаления элемен- тов.

    private static class OwnList<T> {
        Object[] arr;
        int count;

        OwnList() {
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

        /*T remove() {
            if (count == 0) throw new NoSuchElementException();
            T temp = (T) arr[--count];
            arr[count] == null;
            return temp;
        }*/
        @Override
        public String toString() {
            return Arrays.toString(arr);
        }

    }
}