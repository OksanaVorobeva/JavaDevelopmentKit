package seminar3Kostic.fruit;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox =new Box();
        Box<Orange> orangeBoxBox=new Box();
        Box<Fruit> fruitBox=new Box();

        fruitBox.add(new Orange());
        fruitBox.add(new Apple());

        Fruit orange= fruitBox.get(0);
        if (orange instanceof Orange){
            Orange orange1 =(Orange) orange;
        }

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        orangeBoxBox.add(new Orange());
        orangeBoxBox.add(new Orange());

        System.out.println(appleBox.compare(orangeBoxBox));
        appleBox.transferTo(fruitBox);
       // orangeBoxBox.transferTo(appleBox);
    }
}
