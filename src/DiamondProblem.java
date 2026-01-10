
interface A{
    default void m1(){
        System.out.println("interface A....m1.. methods");
    }
}
interface B extends A{
    @Override
    default void m1(){
        System.out.println("interface B... m1...method");
    }
}
interface C extends A{
    @Override
    default void m1(){
        System.out.println("interface C....m1...method");
    }
}
class Child implements  B,C{
    @Override
    public void m1(){
        B.super.m1();
        System.out.println("own implementation");
    }
}
public class DiamondProblem {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.m1();
    }
}
