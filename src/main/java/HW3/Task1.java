package HW3;


public class Task1 {
    //Написать класс Калькулятор (необобщенный), который содержит обобщенные
    // статиче- ские методы: sum(), multiply(), divide(), subtract().
    // Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.

    public static class Calculator {

        public static <T extends Number> double sum(T a, T b) {
            return a.doubleValue() + b.doubleValue();
        }

        public static <T extends Number> double multiply(T a, T b) {
            return a.doubleValue() * b.doubleValue();
        }

        public static <T extends Number> double divide(T a, T b) {
            if (b.doubleValue() == 0) {
                throw new ArithmeticException("Деление на ноль не допускается!");
            }
            return a.doubleValue() / b.doubleValue();
        }

        public static <T extends Number> double subtract(T a, T b) {
            return a.doubleValue() - b.doubleValue();
        }
    }


    public static void main(String[] args) {

        System.out.println(Calculator.sum(1, 2));
        System.out.println(Calculator.divide(6, 1.5));
        System.out.println(Calculator.subtract(5, 3.2));
        System.out.println(Calculator.multiply(1, 3.4));
    }
}


