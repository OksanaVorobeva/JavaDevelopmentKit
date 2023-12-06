package lesson4;

import java.util.ArrayList;
import java.util.LinkedList;

//Integer, Integer
public class HMap {

    private int capacity;

    private ArrayList<LinkedList<Integer>>map ;

    public HMap() {
        capacity=100;
        map=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            map.add(new LinkedList<>());
        }
    }
    //__________

    public  void put(Integer key,Integer value){
        int code=key.hashCode()%capacity;
       LinkedList<Integer> list = map.get(code);
       if (!list.contains(value)){
           list.add(value);
       }
    }
}
