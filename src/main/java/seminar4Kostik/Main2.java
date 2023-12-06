package seminar4Kostik;

import java.util.*;

public class Main2 {
    //В рамках выполнения задачи необходимо
    //Создать коллекцию мужский и женских имен
    //с помощью интерфейса list
    //получите уникальный список Set на основании List
    //Определите наименьший элемент(анлфавитный порядо)
    //Определите наибольший элемент(по количеству букв в слове но в обратном порядке)
    //Удалите все элементы содержашие букву А
    public static void main(String[] args) {
        List<String>list=generalList();
        System.out.println(list);
        Set<String> set=new HashSet<>(list);
        System.out.println(set);
        System.out.println(getMinByAlphabet(set));
        getMaxByLength(set);
        removeByChar(set);
        System.out.println(set);
    }

    static String getMinByAlphabet(Set<String> set){
        Set<String> set1=new TreeSet<>(set);
        System.out.println(set1.stream().min(String::compareTo).get());
        Iterator<String> iterator=set1.iterator();
        if (iterator.hasNext()){
           return iterator.next();
        }
        return null;
    }

    static void  removeByChar(Set<String> set){
        set.removeIf(s-> s.contains("А"));
    }

    static String getMaxByLength(Set<String> set){
        System.out.println(set.stream().max(Comparator.comparingInt(String::length)).get());
        return null;
    }

    static List<String> generalList() {
        List<String> list = new ArrayList<>();
        list.add("Константин");
        list.add("Василий");
        list.add("Анна");
        list.add("Светлана");
        list.add("Иван");
        list.add("Семен");
        list.add("Василий");
        list.add("Анна");
        list.add("Светлана");
        return list;
    }
}
