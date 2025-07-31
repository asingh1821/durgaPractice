package Overriding;

public class A {

    public  void method(int a){
        System.out.println("value of integer a from class A is "+ a);
    }
}
class B extends A{
    public  void method(int a){
        System.out.println("value of integer a from class B is "+ a);
    }
}
