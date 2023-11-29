package lesson2.interface1;

public interface Human {
    default void walk() {
        System.out.println("Walks on two feet");
    }
    public void talk();
}
