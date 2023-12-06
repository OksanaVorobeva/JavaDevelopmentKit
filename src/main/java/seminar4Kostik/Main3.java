package seminar4Kostik;

import java.util.HashMap;
import java.util.Map;

public class Main3 {
    //В рамках выполнения задачи необходимо
    //Создайте телефонный справочник с помощью Map
    //телефон это ключ, а имя значение
    //найдите человека с самым маленьки номером телефона
    //найдите номер телефона человека чье имя самое большое в алфавитном порядке

    public static void main(String[] args) {
        Map<String,String> phoneBook = new HashMap<>();
        phoneBook.put("123","Константин");
        phoneBook.put("1234","Мария");
        phoneBook.put("1235","Вячеслав");
        phoneBook.put("13777","Кирилл");

        System.out.println(phoneBook.entrySet().
                stream().min((e1,e2)-> e1.getKey().compareTo(e2.getKey())).get().getValue());
        System.out.println(phoneBook.entrySet().
                stream().max((e1,e2)-> e1.getValue().compareTo(e2.getValue())).get().getValue());
    }


}
