package HW3;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

public class Task1 {
    //Написать класс Калькулятор (необобщенный), который содержит обобщенные
    // статиче- ские методы: sum(), multiply(), divide(), subtract().
    // Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.

    public static class Calculator {
        @NotNull
        private static <T> T sum(@NotNull T a, T b) {

            return (T) sum(a, b);
        }
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Calculator.<Number>sum(1, 2);


    }
}


