package HW4;

public class Employee {
    String name;
    String phoneNumber;
    int personnelNumber;
    int experience;

    public Employee(String name, String phoneNumber, int personnelNumber, int experience) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.personnelNumber = personnelNumber;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Name: "+ name + ", "+
                "phoneNumber: "+ phoneNumber + ", "+
                "personnelNumber: "+ personnelNumber+", "+
                "experience: "+experience;
    }
}
