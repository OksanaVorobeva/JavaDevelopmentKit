package seminar3.HWLesson;

import java.util.Arrays;

//написать метод, который меняет два элемента массива
//массив может быть любого ссылочного типа
public class Task1 {
    public static void main(String[] args) {
        Object[] arr={1,2.0f,"hello"};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,2);
        System.out.println(Arrays.toString(arr));
    }

    private  static void  swap(Object[] arr, int from, int to){
        Object temp = arr[from];
        arr[from]=arr[to];
        arr[to]=temp;
    }

}
