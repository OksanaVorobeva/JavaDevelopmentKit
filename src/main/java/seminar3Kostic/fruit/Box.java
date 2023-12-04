package seminar3Kostic.fruit;

import seminar3.HWLesson.Task2;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> container;

    public Box() {
        container=new ArrayList<>();
    }

    void add(T fruit){
        container.add(fruit);
    }
    void print(){
        System.out.println(getWeight());
    }

    public T get(int index){
        return  container.get(index);
    }


    float getWeight(){
        return (container.isEmpty() ? 0: container.get(0).getWeight()*container.size());
    }

    boolean compare(Box<?> with){
        return this.getWeight()==with.getWeight();
    }

    /*public void addAll(List<T> list){
        container.addAll(list);
    }*/

    void  transferTo(Box<? super T> dest){
       // dest.addAll(container);
        dest.container.addAll(container);
        container.clear();
    }
}
