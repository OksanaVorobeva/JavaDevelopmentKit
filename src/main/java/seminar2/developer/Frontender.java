package seminar2.developer;

public class Frontender extends Developer implements FrontAction{
    @Override
    public void front() {
        System.out.println("Sleep");
    }
}