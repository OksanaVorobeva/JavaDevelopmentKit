package seminar4Kostik;

import java.util.*;

public class Main1 {
    //В рамках выполнения задачи необходимо
    //Создать коллекцию мужский и женских имен
    //с помощью интерфейса list
    //отсортировать коллекцию в алфавитном порядке
    //отсортировать коллекцию по количеству букв в слове
    //разверните коллекцию

    public static void main(String[] args) {
        List<String> list = generalList();
        System.out.println(list);
        sortByAlphafit(list);
        System.out.println(list);
        sortNyLength(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }

    static List<String> generalList() {
        List<String> list = new ArrayList<>();
        list.add("Константин");
        list.add("Василий");
        list.add("Анна");
        list.add("Светлана");
        list.add("Иван");
        list.add("Семен");
        return list;
    }

    private static void sortByAlphafit(List<String> list) {
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
    }

    private static void sortNyLength(List<String> list){
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               // return Integer.compare(o1.length(),o2.length());
                return o1.length()-o2.length();
            }
        });
    }
}
