package seminar2.developer;

public interface FrontAction {
    void front();
    default void cofee() {
        System.out.println("Drink");
    };
}