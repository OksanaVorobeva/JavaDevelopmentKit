package seminar2.developer;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static void main(String[] args) {


        FullstackDeveloper fullstackDeveloper = new FullstackDeveloper("Pavel", "Java Spring Boot", "Angular");
        fullstackDeveloper.developBackend();
        fullstackDeveloper.developGUI();

        List<Developer> list = new ArrayList<>();
        list.add(new FrontenderImpl("Roman", "JavaScript"));
        list.add(new BackenderImpl("Boris", "Java"));
        list.add(new BackenderImpl("Mariia", "PHP"));
        list.add(new FrontenderImpl("Katya", "React JS"));
        list.add(new BackenderImpl("Pavel", "Java"));
        list.add(new FrontenderImpl("Alex", "Angular"));
        list.add(new BackenderImpl("Petr", "C#"));

        for (Developer developer : list) {
            if (developer instanceof Frontender) {
                ((Frontender) developer).developGUI();
            }else {
                System.out.println("Developer" + developer.getName()+"is not frontender developer.");
            }
        }
    }
}