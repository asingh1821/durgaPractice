package defaultMethodsInJava8;

public class Main {

    public static void main(String[] args) {
        Owl o = new Owl();
        o.canFly();
        Crow c = new Crow();
        c.canFly();
        c.canEat();
    }
}
