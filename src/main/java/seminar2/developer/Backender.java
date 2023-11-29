package seminar2.developer;

public class Backender extends Developer implements BackendAction{
    @Override
    public void back() {
        System.out.println("Backend working");
    }
}
