package lesson3;

import java.io.Serializable;

public class TBox <T>{
    public static final TBox EMPTY_BOX = new TBox<>();
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    static <T> TBox<T> emptyBox(){
        return (TBox<T>)  EMPTY_BOX;
    }

    @Override
    public String toString() {
        return "TBox{" +
                "value=" + value +
                '}';
    }


    private static class Animal {
        protected String name;

        protected Animal(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    private static class Cat extends Animal {
        protected Cat(String name) {
            super(name);
        }
    }

    private static class Dog extends Animal {
        protected Dog(String name) {
            super(name);
        }
    }

    static void printInfo(TBox<?> animalInBox){
        System.out.println("Information about animal: " + animalInBox);
    }

    private  static <T> void testErrorHelper(TBox<T> box){
        box.setValue(box.getValue());
    }

    static  void  testError(TBox<?> box){
        testErrorHelper(box);
    }

    public static void main(String[] args) {
        TBox<String> box=TBox.emptyBox();
        TBox<Cat> catTBox=TBox.emptyBox();
        catTBox.setValue(new Cat("Vasya"));
        printInfo(catTBox);

        TBox<Dog> dogTBox= TBox.emptyBox();
        dogTBox.setValue(new Dog("Kusya"));
        printInfo(dogTBox);

        Cat cat = new Cat("Vasya");
        Animal animal=cat;

        TBox<? extends Cat> catInBox = new TBox<>();
        TBox<? extends Animal> animalInBox =  catInBox;
    }

}
