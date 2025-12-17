package SingletonDesign.lazyInitialization;

import SingletonDesign.lazyInitialization.SingletonDesignPattern;

public class Test {

    public static void main(String[] args) {

        SingletonDesignPattern s1 = SingletonDesignPattern.getInstance();
        SingletonDesignPattern s2 = SingletonDesignPattern.getInstance();
        System.out.println(s1 == s2);
        s1.display();
    }
}
