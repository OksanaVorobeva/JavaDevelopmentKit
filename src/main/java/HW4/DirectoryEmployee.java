package HW4;

import java.util.ArrayList;
import java.util.List;

public class DirectoryEmployee {

    List<Employee> employees;

    public DirectoryEmployee() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public String getInfo() {
        StringBuilder listEmployee = new StringBuilder();

        for (Employee employee : employees) {
            listEmployee.append(employee);
            listEmployee.append("\n");
        }
        return listEmployee.toString();
    }

    public String numberSearch(String name) {
        StringBuilder listInfo = new StringBuilder();
        for (Employee employee : employees) {
            if (employee.getName().contains(name)) {
                listInfo.append(employee.getName());
                listInfo.append(" ");
                listInfo.append(employee.getPhoneNumber());
                listInfo.append("; ");
            }
        }
        return listInfo.toString();
    }


    public String experienceSearch(int experience) {
        StringBuilder listInfo = new StringBuilder();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                listInfo.append(employee.getName());
                listInfo.append(" ");
                listInfo.append(employee.getExperience());
                listInfo.append("; ");
            }
        }
        return listInfo.toString();
    }

    public String personnelNumberSearch(int personnelNumber) {
        StringBuilder listInfo = new StringBuilder();
        for (Employee employee : employees) {
            if (employee.getPersonnelNumber() == personnelNumber) {
                listInfo.append(employee.getName());
                listInfo.append(" ");
                listInfo.append(employee.getPersonnelNumber());
                listInfo.append("; ");
            }
        }
        return listInfo.toString();
    }
}

