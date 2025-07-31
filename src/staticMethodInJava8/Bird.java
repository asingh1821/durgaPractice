package staticMethodInJava8;

public interface Bird {

    default boolean canFly(){    // static method is by default public
        System.out.println("bird can fly");
        return true;
    }
}
