public class Generics<K,V> {
    private K key;
    private V value;

    public void setValue(K key, V value){
        this.key = key;
        this.value = value;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
    }

class Test{

    public static void main(String[] args) {
        Generics<String, Integer> val = new Generics<>();
        val.setValue("Amit", 25);
        String name = val.getKey();
        Integer age = val.getValue();
        System.out.println("name- " + name);
        System.out.println("age- " + age);
    }
}
