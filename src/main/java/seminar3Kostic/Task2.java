package seminar3Kostic;

import java.util.Arrays;

public class Task2<T> {
    //Описать собственную коллекцию – список на основе массива.
    // Коллекция должна иметь возможность хранить любые типы данных,
    // иметь методы добавления и удаления элемен- тов.

    Object[] objects=new Object[10];
    int size;

    public void add(T t){
        if(size>=objects.length){
            Object[] objects1=new Object[objects.length*2];
            System.arraycopy(objects,0,objects1,0,objects1.length);
            objects=objects1;
        }
        objects[size++]=t;
    }

    public void  remove(int index) {
        for (int i = index+1; i <size ; i++) {
            objects[i-1]=objects[i];
        }
        size--;
    }

    public String toString(){
         StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size-1; i++) {
            stringBuilder.append(objects[i]);
            stringBuilder.append(", ");
        }
        stringBuilder.append(objects[size-1]);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Task2<String> stringTask2 = new Task2<>();
        stringTask2.add("1");
        stringTask2.add("2");
        stringTask2.add("3");
        stringTask2.add("4");
        System.out.println(stringTask2);

        stringTask2.remove(1);
        System.out.println();
        System.out.println(stringTask2);
    }
}
