
interface Acc{
    default void m1(){
        System.out.println("A method");
    }
}
interface Bcc{
    default void m1(){
        System.out.println("B method");
    }
}
public class Test3 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}