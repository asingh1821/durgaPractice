package SingletonDesign.lazyInitialization;

public class SingletonDesignPattern {
    private static  SingletonDesignPattern singleDesign;  // Lazy initialization
                                                      // Object is created when it is needed
    private SingletonDesignPattern(){
    }

    public static SingletonDesignPattern getInstance(){
        if(singleDesign == null){
            singleDesign = new SingletonDesignPattern();
        }
        return singleDesign;
    }
    public void display(){
        System.out.print("Singleton design method");
    }
}
