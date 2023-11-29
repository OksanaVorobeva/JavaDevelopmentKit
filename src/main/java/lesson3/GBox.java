package lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class GBox<T> {
    private T value;

    public GBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void showType() {
        System.out.printf("Type is %s, with value %s\\n", value.getClass().getName(), getValue());
    }

    private static <T> void setIfNull(GBox box, T t) {
        if (box.getValue() == null) {
            box.setValue(t);
        }
    }



    private static void boxTest(GBox<Number> n) {
    }

    private static <T extends Number> boolean compare(T src, T dst) {
        return src.equals(dst);
    }

    public static <T> void copyTo(ArrayList<? extends T> src, ArrayList<? super T> dst) {
        for (T o : src) dst.add(o);
    }

    public static void main(String[] args) {

        GBox<String> stringGBox = new GBox<>("Hello!");
        stringGBox.showType();
        GBox<Integer> integerGBox = new GBox<>(12);

        GBox<Integer> integerGBox1;
        GBox<Integer> integerGBox2 = new GBox<Integer>(1);
        GBox<Integer> integerGBox3 = new GBox<>(1);

        GBox<Integer> box = new GBox<>(null);
        setIfNull(box, 13);
        System.out.println(box.getValue());

        GBox<Integer> box1 = new GBox<>(1);
        setIfNull(box1, 13);
        System.out.println(box1.getValue());

        boxTest(new GBox<Number>(10));
        // boxTest(new GBox<Integer>(1));
        //  boxTest(new GBox<Float>(1.0f));

        System.out.println(compare(1, 1.0f));
        //System.out.println(1.0f,1.0f);
        //System.out.println(1,1);

        ArrayList<Integer> ial = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Number> nal = new ArrayList<>(Arrays.asList(1f, 2, 3.0));
        System.out.println(ial);
        System.out.println(nal);
        copyTo(ial, nal);
        System.out.println(nal);
        // copyTo(nal,ial);
        System.out.println(ial);
    }

}

