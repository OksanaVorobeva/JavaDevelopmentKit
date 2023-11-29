package lesson2.interface1;

public class Main {

    private static class Minotaurus implements Human,Bull{
        @Override
        public void walk() {
            System.out.println("Walks on to legs");
        }

        @Override
        public void talk() {
            System.out.println("Asks you a riddle");
        }
    }
    public static void main(String[] args) {
        Bull minos0=new Minotaurus();
        Human minos1=new Minotaurus();
        Minotaurus minos=new Minotaurus();
        Human man1=new Man();
        Bull ox2=new Ox();
        Bull[] allBulls={ox2,minos0,minos};
        Human[] allHuman={man1,minos,minos1};
    }
}
