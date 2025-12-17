package accessModifier.p1;

import accessModifier.p1.A;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.value);
        B b = new B();
        b.printOutput();

    }
}
