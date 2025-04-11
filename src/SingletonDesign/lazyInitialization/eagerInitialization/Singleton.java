package SingletonDesign.lazyInitialization.eagerInitialization;

public class Singleton {  // Early Initialization of object

    private static final Singleton sing  = new Singleton();

    private Singleton(){

    }
    public static Singleton getInstance(){
        return sing;
    }
}
