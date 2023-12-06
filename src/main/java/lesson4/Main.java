package lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> collection = List.of(1, 2, 3, 4, 5);
        //1 Iterator
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        //2 For each
        for (Integer value : collection) {
            System.out.print(value + " ");
        }
        System.out.println();
        //3 Stream api
        collection.stream()
                .forEach(value -> System.out.print(value + " "));
        System.out.println();
        collection.stream().forEach(System.out::println);

        //ArrayList

        ArrayList<Integer> list = new ArrayList<>(collection);
        //[]<-1
        //[_],[1]<-2
        //[1],[__],[1_],[1 2]<-3
        //[1 2],[____],[1 2 __],[1 2 3_]<-4 O(1)
        //[1 2 3 4 5] <-7,2 O(n)
        //[__________] ,[1 2 3 4 5_____] ,[1 2 3 3 4 5____] ,[1 2 7 3 4 5____]
        // list.get(1) O(1)
        //list.set(1,2) O(1)
        // list.contains() O(n)

        //LinkedList

        //Пустой конструктор

        //LinkedList<String> linkedList= new LinkedList<>();

        //создается список, в который добавляет все элементы другой коллекции Collection

        //LinkedList<String> linkedListFromCollection = new LinkedList<>(linkedList);

        Map<String, Integer> map = Map.of("Hello", 1, "World", 2);
        // for each
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        for (String s : map.keySet()) {
            System.out.println(s + ": " + map.get(s));
        }
        //Stream
        map.forEach((k, v) -> System.out.println(k + ": " + v));

        //Начальная емкость по умолчанию-16, коэффициент загрузки-0,75

        HashSet defaultConstructor = new HashSet();

        //Конструктор с заданной начальной емкостью. Кэффициент загрузки-0,75

        HashSet constructorWithCapacity = new HashSet(32);

        //Конструктор с заданными начальной емкостью и коэффициетом загрузки

        HashSet constructorWithCapacityFactor = new HashSet(32, 0.6f);

        //Конструктор, добовляющий элементы из другой коллекции

        HashSet fromCollection = new HashSet(defaultConstructor);

        //Конструктор по умолчанию

        TreeSet defaultConstructorTreeSet = new TreeSet<>();

        //Конструктор, добовляющий элементы из другой коллекции

        TreeSet fromCollectionTreeSet = new TreeSet(defaultConstructorTreeSet);

        //Конструктор создает пустое дерево, где все добавляемые
        //элементы впоследствие будут отсортированы компаратором

        TreeSet withComporator = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
    }
}
