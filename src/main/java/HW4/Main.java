package HW4;

public class Main {
    //Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников -
    // каждый сотрудник должен иметь следующие атрибуты:
    //Табельный номер
    //Номер телефона
    //Имя
    //Стаж
    //Добавить метод, который ищет сотрудника по стажу (может быть список)
    //Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
    //Добавить метод, который ищет сотрудника по табельному номеру
    //Добавить метод добавление нового сотрудника в справочник сотрудников

    public static void main(String[] args) {
        DirectoryEmployee directoryEmployee = new DirectoryEmployee();
        directoryEmployee.addEmployee(new Employee("Петров", "8765234432", 123, 2));
        directoryEmployee.addEmployee(new Employee("Сидоров", "883451263789", 124, 3));
        directoryEmployee.addEmployee(new Employee("Петров", "7652439872", 125, 3));


        System.out.println(directoryEmployee.numberSearch("Петров"));
        System.out.println(directoryEmployee.experienceSearch(3));
        System.out.println(directoryEmployee.personnelNumberSearch(125));

        System.out.println(directoryEmployee.numberSearch("Козлов"));
        System.out.println(directoryEmployee.experienceSearch(4));
        System.out.println(directoryEmployee.personnelNumberSearch(127));
    }

}
