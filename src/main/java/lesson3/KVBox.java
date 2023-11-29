package lesson3;

public class KVBox <K,V>{
    private K key;
    private V value;

    public KVBox(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    public void showType(){
        System.out.printf("Type of key is %s, key -%s, "+
                key.getClass().getName(),getKey(),
                value.getClass().getName(),getValue());
    }



    public static void main(String[] args) {
        KVBox<Integer,String> kvBox = new KVBox<>(1,"Hello");
        KVBox<String,GBox<String>> kvBox1 = new KVBox<>("World",new GBox<>("Java"));
    }
}
