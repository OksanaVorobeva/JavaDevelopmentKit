package lesson2.interface1;

public class Ox implements Bull{
    @Override
    public void walk() {
        System.out.println("Walk on hooves");
    }

    @Override
    public void talk() {
        System.out.println("MoooOoooOOooo");
    }
}
