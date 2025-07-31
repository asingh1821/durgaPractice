package defaultMethodsInJava8;

public interface Bird {

    public  boolean canFly();
    default void canEat(){
        System.out.println("Bird can eat");
    }
}
