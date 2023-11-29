package lesson3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class BBox<V extends Number> {
    private V value;

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    private static <T extends Number> void setIfNull(BBox<T> box, T t) {
        if (box.getValue() == null) {
            box.setValue(t);
        }
    }


    private static class Animal {
        protected String name;

        protected Animal() {
            this.name = "Animal";
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    private static class Cat extends Animal implements Serializable {
        protected Cat() {
            this.name = "Cat";
        }

        public void voice() {
            System.out.println("meow");
        }
    }

    public static <T> void copyTo(ArrayList<? extends T> src, ArrayList<? super T> dst) {
        for (T o : src) dst.add(o);
    }


    private static <T> T pick(T first, T second) {
        return second;
    }

    public static void main(String[] args) {
        BBox<Integer> integerBBox = new BBox<>();
        //BBox<String> stringBBox=new BBox<>();
        setIfNull(integerBBox, 4);
        //setIfNull(stringBBox,"hello");

        ArrayList<Cat> cats = new ArrayList<>(Arrays.asList(new Cat()));
        ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(new Animal()));
        //copyTo(animals,cats);
        System.out.println(cats);
        cats.get(1).voice();

        Serializable se1 = pick("d", new Cat());
        Serializable se2 = pick("d", new ArrayList<String>());

    }

}

