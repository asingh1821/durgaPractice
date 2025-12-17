package Overloading;

public class Xyz {
    void method(int a){
       System.out.println("value "+ a);
    }
    String method(String b){
        System.out.println("string value"+ b);
        return b;
    }
}
